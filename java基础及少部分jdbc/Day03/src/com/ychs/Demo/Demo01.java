/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *  	�ж���������С
 *   @date: 2021��7��29������9:18:52 ;
 */
public class Demo01 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner (System.in);
		System.out.println("����num1 ��");
		if(num1%2==0) {                        //�ж���ż��
			System.out.println("ż��");
		}else {
			System.out.println("����");
		}
		
		
		
		// ctrl +2  l �Զ����ɷ���ֵ
		int num1 = sc.nextInt();	
		System.out.println("����num2 ��");
		int num2 = sc.nextInt();   // alt + ���¼�ͷ    �����ƶ�һ�У�  ctrl alt  ���¼�ͷ    ����һ��
		if(num1>num2){
			System.out.println(num1+">"+num2);
		}else if(num1==num2)
		
		{	System.out.println(num1+"="+num2);
			
		}else{System.out.println(num1+"<"+num2);
		}}
}
