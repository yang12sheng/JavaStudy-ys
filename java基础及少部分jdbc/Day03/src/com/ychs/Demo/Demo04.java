/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 *  switch���
 *   @date: 2021��7��29������10:29:21 ;
 */
public class Demo04 {
	public static void main (String[] args)  {
		int a = 7;
		int b = 9;
		int result = 0 ;
		String oper = "*";
		
		switch(oper) {
		case "+":result=a+b;break;
		case "-":result=a-b;break;
		case "*":result=a*b;break;
		case "/":result=a/b;break;
		default:System.out.println("�������");
		}
		System.out.println(result);
	}
}
