/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��2������10:26:50 ;
 */
public class Student {
	private String idenfied; //ѧ��
	private String name;    //����
	private int age;  //����
	private  String loc;  //��ͥסַ
	public Student() {}
	public Student(String idenfied, String name, int age, String loc) {
		super();
		this.idenfied = idenfied;
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	public void study() {
		System.out.println("ѧϰ");
	}
	public void read() {
		System.out.println("�Ķ�");
	}
	
	public void show() {
		System.out.println("���֤�� " +idenfied+"������"+name+"����"+age+"����ַ"+loc);
	}
}
