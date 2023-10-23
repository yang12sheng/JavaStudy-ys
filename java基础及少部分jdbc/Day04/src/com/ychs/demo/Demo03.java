/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月30日上午10:01:19 ;
 */
public class Demo03 {
	public void f(int a) {
		if(a>5) {
			System.out.println("end...");
			return;
		}System.out.println(a);
	}
	public static void main (String[]args) {
		Demo01 demo01 = new Demo01();
		demo01.f(2);
		demo01.f(6);
	}

}
