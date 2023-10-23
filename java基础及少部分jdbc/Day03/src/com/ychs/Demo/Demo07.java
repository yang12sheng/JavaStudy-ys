/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 * 买饮料
 *   @date: 2021年7月29日上午11:04:42 ;
 */
public class Demo07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入买的瓶数：");
		int num = scan.nextInt();
		
		if(num<1) {System.out.println("不卖！");}
		
		else if(num==1)
		{System.out.println("钱数："+ 6);}
		else {
		System.out.println(6+(num-1)*3);}
		}
}
