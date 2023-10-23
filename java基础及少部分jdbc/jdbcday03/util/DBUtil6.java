package com.ychs.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil6 {
    private static ComboPooledDataSource ds = new ComboPooledDataSource();

    public static DataSource getDataSource(){
        return ds;
    }
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void backConn(Connection conn){
        try {
            conn.close();//把连接归还连接池
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(DBUtil6.getConnection());
    }
}
