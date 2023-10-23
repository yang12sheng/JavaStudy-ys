/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *1.重写中 父类声明了一个异常，子类可以声明父类的异常， 或者是 父类异常的子异常    ，或者是什么也 不声明  ，
 *父类异常的父异常，
 *2.如果父类中声明了多个异常，子类可以声明其中某一个异常
 *3.如果父类中没有声明异常，子类中有异常 只能是 try catch 自己内部处理，如果catch里面不想处理   
 *能不能手动抛出一个 运行时异常？  能
 *   @date: 2021年8月12日下午2:11:07 ;
 */
public class Demo06fu {
	public void f1() throws NullPointerException{
		System.out.println("f1...");
	}
	public void f2() throws Exception{
		System.out.println("f2...");
	}
	
	public void f3() throws NullPointerException,ArrayIndexOutOfBoundsException{
		System.out.println("f3...");
	}
	
	public void f4() throws ArrayIndexOutOfBoundsException{
		System.out.println("f4...");
	}
	public void f6() {
	
	}
	
}
