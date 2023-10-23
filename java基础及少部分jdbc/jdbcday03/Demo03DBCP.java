package com.ychs;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo03DBCP {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbcday03/src/dbcp.properties"));
//        System.out.println(prop.getProperty("driverClassName"));
//        System.out.println(prop.getProperty("url"));
//        System.out.println(prop.getProperty("username"));
//        System.out.println(prop.getProperty("password"));
        DataSource ds = BasicDataSourceFactory.createDataSource(prop);
        System.out.println(ds.getConnection());


    }
}
