/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *  �������ʱ��ĺ�һ��
 *   @date: 2021��7��29������9:51:17 ;
 */
public class Demo03 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("����num1 ��");
		int num1 = sc.nextInt();
		System.out.println("����num2 ��");
		int num2 = sc.nextInt();
		System.out.println("����num3 ��");
		int num3 = sc.nextInt();
		
//		System.out.println("�밴hh  mm  ss�ĸ�ʽ����һ��ʱ��");
//		int hour = sc.nextInt();		//Сʱ
//		int minute = sc.nextInt();		//����
//		int second = sc.nextInt();		//��
		
		if(num3>60||num2>60||num1>24) {
			System.out.println("���벻�Ϸ�");
		}
		if((num3+1)>=0&&(num3+1)<60) {
			if(num2<60) {
				if(num1<24) {
					System.out.println(num1+":"+num2+":"+(num3+1));
				}
			}
		}else if(num3+1==60) {
			num2=num2+1;
			num3=0;
			if(num2==60) {
				num1=num1+1;
				num2=0;
				System.out.println(num1+":"+num2+":"+num3);
			}else 
			{
				System.out.println(num1+":"+num2+":"+num3);
			}
		}
	}
}
