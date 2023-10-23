/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月12日下午3:15:55 ;
 */
public class Demo09 {
public static void main(String[] args) {
	Student stu1=new Student();
	
	try {
		stu1.setAge(201);
	} 
	catch (MyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		//释放资源 
	System.out.println("-===--谢谢输入");
	}
	
}
}
