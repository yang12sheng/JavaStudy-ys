/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��12������3:15:55 ;
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
		//�ͷ���Դ 
	System.out.println("-===--лл����");
	}
	
}
}
