/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月28日上午10:31:51 ;
 */
public class Person {
	//成员变量
	//静态变量
	double score = 98.5;
	String name = "张三" ;
	char sex ;
	// 成员方法
	//静态方法
	public static void main (String[] args) {
		Person p1 = new Person();
		System.out.println("最高分"+ p1.score);
		System.out.println("最高分姓名"+ p1.name);
		System.out.println("最高分性别"+ p1.sex);
	}
}
