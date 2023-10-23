/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月2日上午9:41:53 ;
 */
public class Demo02Person {
	public static void main(String[] args) {
	// 栈中对象的引用指向堆内存空间
		Person p1 = new Person(18,'f');
		p1.show();
		p1.setAge(12);
		p1.setIdenfied("12121212");
		p1.setName("zs");
		p1.show();
		
		//alt shift a   选择 多行  一起改
		Person p2 = new Person(18,'m');
		p2.setAge(18);
		p2.setIdenfied("1212112121545");
		p2.setName("gkjjk");
		p2.show();
		
		
	}
}
