/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 * 输入一个数    输出加法表
 *   @date: 2021年7月29日下午2:55:54 ;
 */
public class Demo11 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("请输入一个数：");
			int num = 0;
			if (scan.hasNextInt()) {   // 判断是否为数字
				num = scan.nextInt();
				System.out.println("根据这个数可以输出以下加法表：");
				for (int i = 0; i <= num; i++) {
					System.out.println(i + "+" + (num - i) + "=" + num);
				}
			}else{
				System.out.println("格式错误，请输入一个整数");
				
			}
		}
	}

