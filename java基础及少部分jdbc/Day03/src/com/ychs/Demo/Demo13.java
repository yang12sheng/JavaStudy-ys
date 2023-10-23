/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月29日下午4:09:50 ;
 */
public class Demo13 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 12;
		Person p2 = new Person();
		p2.age = 12;
		System.out.println(p1==p2);
		System.out.println("abc"=="abc");
		System.out.println(p1.equals(p2));
		System.out.println(p2);
		System.out.println(p1);
	}
}
