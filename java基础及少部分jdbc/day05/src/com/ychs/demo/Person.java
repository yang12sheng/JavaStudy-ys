/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 * 属性和行为
 *   @date: 2021年8月2日上午9:38:04 ;
 */
public class Person {
	//属性一般设置成私有的  作用域是当前自己的类里面才能访问
	private String idenfied;
	private String name;
	private int age;
	private boolean flag;
	private char sex ;
	//构造方法 不写的情况， jvm 提供了 默认无参 的构造方法
	//如果提供了构造方法java 虚拟机 不会提供无参的构造方法 ，需要自己提供
	//给成员变量 赋值 有两种方法，一种是set  赋值  （较好）还有一种 构造方法赋值 。
	//构造方法是 方法的重载
	//作用 ：1.创建对象 2. 初始化成员变量
	public Person() {
		
	}
  	public Person(int age,char sex) {
		this.age=age;
		this.sex=sex;
	}
  	// alt  shift s
	public Person(String idenfied, String name, int age, boolean flag, char sex) {
		super();
		this.idenfied = idenfied;
		this.name = name;
		this.age = age;
		this.flag = flag;
		this.sex = sex;
	}
	public void show() {
		System.out.println("身份证： " +idenfied+"，姓名"+name+"年龄"+age+"，性别"+sex+",,"+flag);
	}
	public void setIdenfied(String idenfied) {
		//d当前对象的意思
		this.idenfied=idenfied;
	}
	public void setName(String name) {
		//d当前对象的意思
		this.name=name;
	}
	public void setAge(int age1) {
		//d当前对象的意思
		this.age=age1;
	}
}
