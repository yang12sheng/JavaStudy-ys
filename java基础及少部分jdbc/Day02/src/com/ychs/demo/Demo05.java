/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *  成绩平均分
 *   @date: 2021年7月28日下午4:04:43 ;
 */
public class Demo05 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);  // ctrl 1 导包 ctrl shift o 整理包
		
		
//		System.out.println("输入姓名" );
//		String xm = sc.next();	System.out.println(xm );
//		System.out.println("输入年龄" );
//		int nl = sc.nextInt();	System.out.println(nl );
//		System.out.println("输入身高" );
//		String sg = sc.next();	System.out.println(sg );
//	
		
		System.out.println("输入stb" );
		int stb = sc.nextInt();
		System.out.println("输入java" );
		int java= sc.nextInt();	
		System.out.println("输入sql" );
		int sql = sc.nextInt();
		
		System.out.println("---------------------" );
		System.out.println("stb\tjava\tsql" );
		System.out.println(stb+"\t"+java+"\t"+sql );
		System.out.println("---------------------" );
		
		int c = java-sql;
		System.out.println("java和sql的成绩差："+c);
	    double p =(double)((stb+java+sql)/3);
		System.out.println("3门课的平均分是:"+p);
}}
