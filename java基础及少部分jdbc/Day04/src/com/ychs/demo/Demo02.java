/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��7��30������9:46:27 ;
 */
public class Demo02 {
	public static void main (String[] args) {
		int num = Demo01.getNum();
		Demo01 demo01 = new Demo01();
	int num2 = 	demo01.getNum();
	System.out.println(num2);
		demo01.printStar(2,3);
		double d = demo01.getAvg(3, 5, 4);
		System.out.println(d);
		System.out.println(demo01.getAvg(3, 5, 4));
}}
