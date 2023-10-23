/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月29日上午11:19:26 ;
 */
public class Demo09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int month = scan.nextInt();
//		System.out.println(month/10);
		switch (month/10) {
		case 10:
		    case 9:
		    	   System.out.println("优秀");
		    	   break;
		    case 8:
		    	   System.out.println("良好");
		    	   break;
		    case 7:
		    	System.out.println("中等");
		    	   break;
		    case 6:
		    	    System.out.println("及格");
		    	    break;
		    default:
		    	   System.out.println("不及格");
            break;
}}}
