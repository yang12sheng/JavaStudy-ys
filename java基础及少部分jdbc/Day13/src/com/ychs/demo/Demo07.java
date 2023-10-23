/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月12日下午2:31:04 ;
 */
public class Demo07 {
public static void main(String[] args) {
	try {
		int i=1/0;
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  //打印异常的堆栈信息
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		
	}
}
}
