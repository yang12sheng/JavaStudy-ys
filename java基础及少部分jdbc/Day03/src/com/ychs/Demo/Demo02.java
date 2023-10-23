/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *        判断闰年平年
 *   @date: 2021年7月29日上午9:37:25 ;
 */
public class Demo02 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner (System.in);
		System.out.println("输入num1 ：");
		int num1 = sc.nextInt();
		
		if(num1%400==0||(num1%4==0&&num1%100!=0)) {
		System.out.println("闰年");
		}else {
		System.out.println("平年");
		      }
	
	}
}
