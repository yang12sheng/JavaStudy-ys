/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *
 *   @date: 2021��7��28������3:47:31 ;
 */
public class Demo04 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);  // ctrl 1 ���� ctrl shift o �����
		System.out.println("���� double ����" );
		double d = sc.nextDouble();
		System.out.println(d);          //syso    alt+/
		System.out.println("���� �ַ���");
		String s = sc.next();
		String s2 = sc.nextLine();
		System.out.println(s +", "+ s2);
	}
}
