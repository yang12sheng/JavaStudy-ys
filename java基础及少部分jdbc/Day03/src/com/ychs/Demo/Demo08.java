/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *���ݸ����������ж���δ�����ˣ������ˣ������˻���������
 *   @date: 2021��7��29������11:12:41 ;
 */
public class Demo08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���������䣺");
		int num = scan.nextInt();
	if (num>=0&&num<200) {
		if(num<18) {System.out.println("δ����");}
		else if(num<30) {System.out.println("������");}
		else if(num<60) {System.out.println("������");}
		else  {System.out.println("������");}
	}else
		System.out.println("���벻�Ϸ�");
	}
}
