/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *��������
 *ͬһ���� ��������һ�� �����б�ͬ����������  �������� ������˳��ע�⣩��
 *�ͷ���ֵû��ϵ
 *���췽������
 *   @date: 2021��7��30������10:54:41 ;
 */
public class Demo07 {
	int age;
	String name;
	
	public Demo07(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	
	
	public void add(int a ,int b) {
		System.out.println(a+b);
	}
	public int add(int a ,int b,int c) {
		System.out.println(a+b);
		return a+b+c;
	}
	public void add(int a ,double b) {
		System.out.println(a+b);
	}
	public void add( double b,int a) {
	System.out.println(a+b);
    }
	public static void main (String[]args) {
		Demo07 d = new Demo07();
	     	d.add(3, 4);
	}
}
