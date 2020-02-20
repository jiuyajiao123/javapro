package com.liu.dao;

import com.liu.pojo.Dept;
import com.liu.util.Jdbcutil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.neuedu.tushuguan.MyBookMain.list;

/**
 * Created by 86183 on 2020/2/18.
 */
public class Deptdao implements Ideptdao {
    String url = "jdbc:mysql://localhost:3306/liu?useUnicode=ture&characterEncoding=utf8";
    String username = "root";
    String password = "123456";

    @Override
    public List<Dept> query() {
        List<Dept> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            pst = con.prepareStatement("select deptno,dname,loc from dept");
            rs = pst.executeQuery();
            while (rs.next()) {
                Dept dept = new Dept();
                dept.setDeptno(rs.getInt("deptno"));
                dept.setDname(rs.getString("dname"));
                dept.setLoc(rs.getString("loc"));
                list.add(dept);
            }
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (pst != null)
                    pst.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Dept dept) {
        return Jdbcutil.executeUpdata("insert into student(deptno,dname,loc) values (?,?,?)", dept.getDeptno(), dept.getDname(), dept.getLoc());
    }

    @Override
    public int updata(Dept dept) {
        return Jdbcutil.executeUpdata("update dept set dname?,loc? where deptno=?", dept.getDeptno(), dept.getDname(), dept.getLoc());
    }

    @Override
    public int del(int deptno) {
        return Jdbcutil.executeUpdata("delete from student where deptno=?", deptno);
    }

    @Override
    public Dept queryone(int deptno) {
        return null;
    }
}
