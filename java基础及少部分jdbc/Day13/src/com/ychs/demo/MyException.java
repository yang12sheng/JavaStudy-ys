/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *自定义异常类：
 *1.继承exception 或其子类
 *2.无参的构造方法           和有参的构造方法
 *   @date: 2021年8月12日下午2:37:11 ;
 */
//public class MyException extends  RuntimeException{
	public class MyException extends  Exception{
	public MyException() {
	
	}
	public MyException(String msg) {
		super(msg);
	}

}


