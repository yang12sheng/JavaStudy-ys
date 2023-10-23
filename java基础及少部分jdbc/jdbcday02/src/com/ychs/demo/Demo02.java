package com.ychs.demo;

import java.util.ResourceBundle;

public class Demo02 {
public static void main(String[] args) {
	ResourceBundle bundle = ResourceBundle.getBundle("db");
	String driver = bundle.getString("driver");
	String url = bundle.getString("url");
	String username = bundle.getString("username");
	String password = bundle.getString("password");
System.out.println(driver+","+url+username+password);
}
}
