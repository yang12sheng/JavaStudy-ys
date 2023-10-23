/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *方法重载
 *同一类中 方法名称一样 参数列表不同（参数个数  参数类型 ，参数顺序（注意））
 *和返回值没关系
 *构造方法重载
 *   @date: 2021年7月30日上午10:54:41 ;
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
