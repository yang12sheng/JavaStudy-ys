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
 *   @date: 2021��8��13������4:14:42 ;
 */
public class Demo10 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	//Properties ����map �ķ���������
	Properties prop = new Properties();
	prop.put("aaa","az");
	prop.setProperty("bbb", "ls");
	
	prop.store(new FileOutputStream(new File("src\\a.properties")),"comment"); //    \\  / ����һ��
	//��ȡ�����ļ�
	prop.load(new FileInputStream(new File("src\\a.properties")));
	System.out.println(prop);
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.get("password"));
	//��ȡprop�е����е�keyֵ
	Set<String> names = prop.stringPropertyNames();
	for (String s : names) {
		System.out.println(s);
		System.out.println(prop.getProperty(s));
	}
	
	
}
}
