/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 * ������
 *   @date: 2021��7��29������11:04:42 ;
 */
public class Demo07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���������ƿ����");
		int num = scan.nextInt();
		
		if(num<1) {System.out.println("������");}
		
		else if(num==1)
		{System.out.println("Ǯ����"+ 6);}
		else {
		System.out.println(6+(num-1)*3);}
		}
}
