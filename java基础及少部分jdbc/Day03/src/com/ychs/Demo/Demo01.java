/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *  	判断两个数大小
 *   @date: 2021年7月29日上午9:18:52 ;
 */
public class Demo01 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner (System.in);
		System.out.println("输入num1 ：");
		if(num1%2==0) {                        //判断奇偶数
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		
		
		
		// ctrl +2  l 自动生成返回值
		int num1 = sc.nextInt();	
		System.out.println("输入num2 ：");
		int num2 = sc.nextInt();   // alt + 上下箭头    上下移动一行；  ctrl alt  上下箭头    复制一行
		if(num1>num2){
			System.out.println(num1+">"+num2);
		}else if(num1==num2)
		
		{	System.out.println(num1+"="+num2);
			
		}else{System.out.println(num1+"<"+num2);
		}}
}
