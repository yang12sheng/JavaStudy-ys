/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *Comparable �ڲ��Ƚ���
 *   @date: 2021��8��11������9:23:22 ;
 */
public class Person {
	//public class Person implements Comparable<Person>{    //�ڲ��Ƚ���
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return this.age-o.age;
//	}
}
