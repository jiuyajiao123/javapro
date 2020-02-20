package com.liu.util;

import com.liu.test.Column;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 86183 on 2020/2/19.
 */
public class Jdbcutil {
    private static final String URL = "jdbc:mysql://localhost:3306/liu?useUnicode=ture&characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getconnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static int executeUpdata(String sql, Object... params) {
        int result = 0;
        Connection con = getconnection();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement("");
            if (params != null) {
                for (int i = 0; i <= params.length; i++) {
                    pst.setObject(i + 1, params[i]);
                }
            }
            result = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pst);
        }
        return result;
    }

    public static <T> List<T> executeQuery(String sql, Class<T> clz, Object... params) {
        List<T> list = new ArrayList<>();
        Connection con = getconnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = con.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i <= params.length; i++) {
                    pst.setObject(i + 1, params[i]);
                }
            }
            rs = pst.executeQuery();
            while (rs.next()) {
                T t = clz.newInstance();
                Field[] fields = clz.getDeclaredFields();
                /*rs.getInt("deptno");
                rs.getString("dname");
                rs.getString("loc");*/
                for (Field f : fields) {
                    String column = f.getName();
                    if (f.isAnnotationPresent(Column.class)) {
                        Column c = f.getAnnotation(Column.class);
                        column = c.value();

                    }

                    Object value = rs.getObject(f.getName());
                    System.out.println(value);
                    f.setAccessible(true);
                    f.set(t, value);
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static <T> List<T> executeQuery(String sql, Rowmap<T> rowmap, Object... params) {
        List<T> list = new ArrayList<>();
        Connection con = getconnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = con.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i <= params.length; i++) {
                    pst.setObject(i + 1, params[i]);
                }
            }
            rs = pst.executeQuery();
            while (rs.next()) {
                T t = rowmap.rowmapping(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pst, rs);
        }
        return list;
    }

    static void close(Connection con, PreparedStatement pst) {
        try {
            if (pst != null)
                pst.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void close(Connection con, PreparedStatement pst, ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
            close(con, pst);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int add(int... array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum;
    }

}

