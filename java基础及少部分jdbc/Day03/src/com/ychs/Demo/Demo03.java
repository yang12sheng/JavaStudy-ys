/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *  输出输入时间的后一秒
 *   @date: 2021年7月29日上午9:51:17 ;
 */
public class Demo03 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("输入num1 ：");
		int num1 = sc.nextInt();
		System.out.println("输入num2 ：");
		int num2 = sc.nextInt();
		System.out.println("输入num3 ：");
		int num3 = sc.nextInt();
		
//		System.out.println("请按hh  mm  ss的格式输入一个时间");
//		int hour = sc.nextInt();		//小时
//		int minute = sc.nextInt();		//分钟
//		int second = sc.nextInt();		//秒
		
		if(num3>60||num2>60||num1>24) {
			System.out.println("输入不合法");
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
