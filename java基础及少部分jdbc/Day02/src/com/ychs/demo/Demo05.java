/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *  �ɼ�ƽ����
 *   @date: 2021��7��28������4:04:43 ;
 */
public class Demo05 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);  // ctrl 1 ���� ctrl shift o �����
		
		
//		System.out.println("��������" );
//		String xm = sc.next();	System.out.println(xm );
//		System.out.println("��������" );
//		int nl = sc.nextInt();	System.out.println(nl );
//		System.out.println("�������" );
//		String sg = sc.next();	System.out.println(sg );
//	
		
		System.out.println("����stb" );
		int stb = sc.nextInt();
		System.out.println("����java" );
		int java= sc.nextInt();	
		System.out.println("����sql" );
		int sql = sc.nextInt();
		
		System.out.println("---------------------" );
		System.out.println("stb\tjava\tsql" );
		System.out.println(stb+"\t"+java+"\t"+sql );
		System.out.println("---------------------" );
		
		int c = java-sql;
		System.out.println("java��sql�ĳɼ��"+c);
	    double p =(double)((stb+java+sql)/3);
		System.out.println("3�ſε�ƽ������:"+p);
}}
