/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *
 *   @date: 2021��7��29������11:19:26 ;
 */
public class Demo09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ɼ���");
		int month = scan.nextInt();
//		System.out.println(month/10);
		switch (month/10) {
		case 10:
		    case 9:
		    	   System.out.println("����");
		    	   break;
		    case 8:
		    	   System.out.println("����");
		    	   break;
		    case 7:
		    	System.out.println("�е�");
		    	   break;
		    case 6:
		    	    System.out.println("����");
		    	    break;
		    default:
		    	   System.out.println("������");
            break;
}}}
