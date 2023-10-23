/**
 *  @version:
 */
package com.ychs.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日下午4:14:42 ;
 */
public class Demo10 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	//Properties 所有map 的方法都能用
	Properties prop = new Properties();
	prop.put("aaa","az");
	prop.setProperty("bbb", "ls");
	
	prop.store(new FileOutputStream(new File("src\\a.properties")),"comment"); //    \\  / 作用一样
	//读取属性文件
	prop.load(new FileInputStream(new File("src\\a.properties")));
	System.out.println(prop);
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.get("password"));
	//获取prop中的所有的key值
	Set<String> names = prop.stringPropertyNames();
	for (String s : names) {
		System.out.println(s);
		System.out.println(prop.getProperty(s));
	}
	
	
}
}
