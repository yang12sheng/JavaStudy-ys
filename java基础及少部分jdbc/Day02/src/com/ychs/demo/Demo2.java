/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月28日上午11:13:13 ;
 */
public class Demo2 {
	public static void main (String[] args) {
		long num = 89L ;
	    double num1 = num ;   //由低到高自动提升类型 
	    System.out.println(num1);
	    
	    num = (long) num1;   // double -- ->long  强转
	    System.out.println(num);
	    
	    short s = 12;
	    s = (short) (s+1) ; //s short   1 int  需要强转
	    s += 1;
	    
	    char c = 'a'+1;
	    char c1 = 'a';
	    System.out.println(c); System.out.println(c1);
	    
	    int o = 'a';
	    short p = 'a';	    System.out.println(o); System.out.println(p);

	}
}
