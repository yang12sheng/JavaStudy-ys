/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *        �ж�����ƽ��
 *   @date: 2021��7��29������9:37:25 ;
 */
public class Demo02 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner (System.in);
		System.out.println("����num1 ��");
		int num1 = sc.nextInt();
		
		if(num1%400==0||(num1%4==0&&num1%100!=0)) {
		System.out.println("����");
		}else {
		System.out.println("ƽ��");
		      }
	
	}
}
