/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月2日上午10:26:50 ;
 */
public class Student {
	private String idenfied; //学号
	private String name;    //姓名
	private int age;  //年龄
	private  String loc;  //家庭住址
	public Student() {}
	public Student(String idenfied, String name, int age, String loc) {
		super();
		this.idenfied = idenfied;
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	public void study() {
		System.out.println("学习");
	}
	public void read() {
		System.out.println("阅读");
	}
	
	public void show() {
		System.out.println("身份证： " +idenfied+"，姓名"+name+"年龄"+age+"，地址"+loc);
	}
}
