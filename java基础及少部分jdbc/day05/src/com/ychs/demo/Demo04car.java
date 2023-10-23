/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月2日上午10:39:47 ;
 */
public class Demo04car {
	public static void main(String[] args) {
		// 栈中对象的引用指向堆内存空间
			Car p1 = new Car("红色",3);
			
			p1.show();
			p1.start();
			p1.end();
			
			
			
		}
}
