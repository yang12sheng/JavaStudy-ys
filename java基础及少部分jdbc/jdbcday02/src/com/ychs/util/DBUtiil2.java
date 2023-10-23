/**
 *  @version:
 */
package com.ychs.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import sun.applet.Main;

/**
 * @author Ysheng
 *
 *   @date: 2021年10月24日上午9:42:07 ;
 */
public class DBUtiil2 {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static {
		Properties prop =new Properties();
		try {
			prop.load(new FileInputStream("src/db.properties"));
			driver=prop.getProperty("driver");
			url=prop.getProperty("url");
			username=prop.getProperty("username");
			password=prop.getProperty("password");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//获取数据库连接
	public static Connection getConnection() {
	Connection conn = null;
	
		try {	//1.注册驱动
			Class.forName(driver);
			//2.获取数据库连接
			try {
				conn= DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
		}public static void main(String[] args) {
			System.out.println(DBUtiil2.getConnection());
		}
}
