/**
 *  @version:
 */
package com.ychs.demo;



/**
 * @author Ysheng
 *
 *   @date: 2021年8月17日上午9:39:27 ;
 */
public class Person {
	private int age;
	private String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private void f1() {
		System.out.println(".f1");
	}
}
