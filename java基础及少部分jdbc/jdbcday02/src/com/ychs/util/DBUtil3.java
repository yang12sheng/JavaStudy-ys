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
import java.util.ResourceBundle;

/**
 * @author Ysheng
 *
 *   @date: 2021��10��24������10:19:23 ;
 */
public class DBUtil3 {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		 driver = bundle.getString("driver");
		 url = bundle.getString("url");
		 username = bundle.getString("username");
		 password = bundle.getString("password");
	}
	//��ȡ���ݿ�����
	public static Connection getConnection() {
	Connection conn = null;
	
		try {	//1.ע������
			Class.forName(driver);
			//2.��ȡ���ݿ�����
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
			System.out.println(DBUtil3.getConnection());
		}
}
