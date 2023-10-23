package com.ychs;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo02DBCP {
    public static void main(String[] args) throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test01");
        ds.setUsername("root");
        ds.setPassword("123456");
        Connection conn = ds.getConnection();
        System.out.println(conn);

    }
}
