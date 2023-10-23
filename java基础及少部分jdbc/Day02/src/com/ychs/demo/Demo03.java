/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *两数交换
 *   @date: 2021年7月28日下午2:08:52 ;
 */
public class Demo03 {
	 public static void main (String[] args)  {
		 int a = 7;
		 int b = 10;
		 int temp;
		 temp = a;
		 a=b;
		 b=temp;
		 System.out.println(" "+a+" "  +b);
		 System.out.println("a "+1+1 );   //a 11  
		 
		 
		 a=a+b;   //17
		 b=a-b;   // 7
		 a=a-b;    //10
		 
		 //
		 int i = (int) (1-0.9);  // 0
		 
		 int j=2147483647;
		 int xx = j+1;  // x+1<x   
		 
		 int m=4;
		 int n=++m;// m=m+1 n=m+n  m= 5   n= 5
		 int n1=m++;  // m=n   m=m+1
	 }
	 
}
