/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月30日上午9:30:12 ;
 */
public class Demo01 {
	//成员方法
	public void printStar() {	
		for (int i=0;i<3;i++) {
		   for (int j=0;j<3;j++) {
			System.out.println("*");
		   }
		   System.out.println("\n");
	    };
	}


//定义有返回值无参数方法
public static int getNum() {             
	// 静态方法
	Scanner sc = new Scanner(System.in);
	return sc.nextInt();
	
}

public void printStar(int m, int n) {
	for (int i=0;i<3;i++) {
		   for (int j=0;j<3;j++) {
			System.out.println("*");
		   }
		   System.out.println("\n");
	    };
}

public double getAvg(int a, int b, int c) {
	return (a+b+c)/3.0;
}


public static void main (String[] args) {
	getNum();
	Demo01 demo01 = new Demo01();
	int num2 = 	demo01.getNum();
	System.out.println(num2);
	demo01.printStar(2,3);
	double d = demo01.getAvg(3, 5, 4);
	System.out.println(d);
}}