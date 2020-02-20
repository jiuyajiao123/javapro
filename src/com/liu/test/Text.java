package com.liu.test;

import com.liu.pojo.Dept;
import com.liu.util.Jdbcutil;
import com.liu.util.Rowmap;
import com.liu.web.Deptweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 86183 on 2020/2/18.
 */
public class Text {
    public static void main(String[] args) {
        /*Deptweb deptweb = new Deptweb();
        deptweb.showmian();
        deptweb.input();
        //System.out.println(Jdbcutil.add(1,2,3,4,5));
        Class clz = Dept.class;
        List<Dept> list = Jdbcutil.executeQuery("select deptno,dname,loc form dept", Dept.class);
        System.out.println(list);

        list = Jdbcutil.executeQuery("select deptno,dname,loc form dept", new Rowmap<Dept>() {
            @Override
            public Dept rowmapping(ResultSet rs) {
                Dept dept = new Dept();
                try {
                    dept.setDeptno(rs.getInt("deptno"));
                    dept.setDname(rs.getString("dname"));
                    dept.setLoc(rs.getString("loc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return dept;
            }
        });
        System.out.println(list);
    }*/

        Connection con = Jdbcutil.getconnection();
        PreparedStatement pst = null;
        try {
            con.setAutoCommit(false);
            pst = con.prepareStatement("insert into dept(deptno,dname,loc) value (?,?,?)");
            pst.setInt(1, 80);
            pst.setString(2, "聚会部");
            pst.setString(3, "天宫");
            con.commit();
            int i = pst.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                if (pst != null)
                    pst.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
