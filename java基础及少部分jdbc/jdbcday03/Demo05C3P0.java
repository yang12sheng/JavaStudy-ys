package com.ychs;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.SQLException;

public class Demo05C3P0 {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        System.out.println(ds.getConnection());
    }
}
