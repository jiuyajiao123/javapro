package com.neuedu.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by 86183 on 2020/2/18.
 */
public class Text {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/task?useUnicode=ture&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            pst = con.prepareStatement("");
            int i = pst.executeUpdate();
            System.out.println(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
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
