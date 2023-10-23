/**
 *  @version:
 */
package com.ychs.Demo;
	import java.util.Scanner;
/**
 * @author Ysheng
 *根据月份判断是第几个季度，是什么季节。
 *   @date: 2021年7月29日上午10:57:38 ;
 */
public class Demo06 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("请输入月份：");
			int month = scan.nextInt();
			switch (month) {
			    case 3:
			    case 4:
			    case 5:
			    	   System.out.println("第一个季度是春季");
			    	   break;
			    case 6:
			    case 7:
			    case 8:
			    	   System.out.println("第二个季度是夏季");
			    	   break;
			    case 9:
			    case 10:
			    case 11:
			    	   System.out.println("第三个季度是秋季");
			    	   break;
			    case 12:
			    case 1:
			    case 2 :
			    	    System.out.println("第四个季度是冬季");
			    	    break;
			    default:
			    	   System.out.println("输入错误，无法判断");
	            break;
			}

		}

	}


