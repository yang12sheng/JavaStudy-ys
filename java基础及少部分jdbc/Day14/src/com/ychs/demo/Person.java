/**
 *  @version:
 */
package com.ychs.demo;

import java.io.Serializable;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日下午2:53:50 ;
 */
public class Person implements Serializable{
	private String name;
	private int age ;
	public static int num=12;
	private  transient int num2;          //瞬态关键字  被 transient,static修饰的属性不会被序列化 
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, int num2) {
		super();
		this.name = name;
		this.age = age;
		this.num2 = num2;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", num2=" + num2 + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
