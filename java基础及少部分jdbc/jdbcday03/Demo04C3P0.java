package com.ychs;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

public class Demo04C3P0 {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/test01");
        ds.setUser("root");
        ds.setPassword("123456");
        System.out.println(ds.getConnection());
    }
}
