/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *
 *   @date: 2021��7��30������9:30:12 ;
 */
public class Demo01 {
	//��Ա����
	public void printStar() {	
		for (int i=0;i<3;i++) {
		   for (int j=0;j<3;j++) {
			System.out.println("*");
		   }
		   System.out.println("\n");
	    };
	}


//�����з���ֵ�޲�������
public static int getNum() {             
	// ��̬����
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