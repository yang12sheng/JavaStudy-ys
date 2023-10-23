/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月28日下午3:47:31 ;
 */
public class Demo04 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);  // ctrl 1 导包 ctrl shift o 整理包
		System.out.println("输入 double 数字" );
		double d = sc.nextDouble();
		System.out.println(d);          //syso    alt+/
		System.out.println("输入 字符串");
		String s = sc.next();
		String s2 = sc.nextLine();
		System.out.println(s +", "+ s2);
	}
}
