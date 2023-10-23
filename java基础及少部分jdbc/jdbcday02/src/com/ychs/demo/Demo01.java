/**
 *  @version:
 */
package com.ychs.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ysheng
 *
 *   @date: 2021年10月24日上午9:37:42 ;
 */
public class Demo01 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties prop =new Properties();
	prop.load(new FileInputStream("src/db.properties"));
	System.out.println(prop.getProperty("driver"));
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.get("password"));
}
}
