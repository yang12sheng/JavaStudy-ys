package com.ychs.util;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil4 {
    private static BasicDataSource ds = new BasicDataSource();
    static{
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test01");
        ds.setUsername("root");
        ds.setPassword("123456");
    }
    /**
     * 获取数据源
     * @return
     */
    public static DataSource getDataSource(){
        return ds;
    }
    /**
     * 获取数据库连接
     * @return
     */
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void back(Connection conn){
        try {
            //归还到连接池
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(DBUtil4.getConnection());
    }
}
