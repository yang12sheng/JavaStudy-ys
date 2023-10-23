/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *根据给定的年龄判断是未成年人，青年人，中年人还是老年人
 *   @date: 2021年7月29日上午11:12:41 ;
 */
public class Demo08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int num = scan.nextInt();
	if (num>=0&&num<200) {
		if(num<18) {System.out.println("未成年");}
		else if(num<30) {System.out.println("青年人");}
		else if(num<60) {System.out.println("中年人");}
		else  {System.out.println("老年人");}
	}else
		System.out.println("输入不合法");
	}
}
