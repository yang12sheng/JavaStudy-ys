/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *学生类主类
 *   @date: 2021年8月2日上午10:32:00 ;
 */
public class Demo03student {
	public static void main(String[] args) {
		// 栈中对象的引用指向堆内存空间
			Student p1 = new Student("15154515151","f",18,"foai");
			
			p1.show();
			p1.study();
			p1.read();
			
			
			
		}
}
