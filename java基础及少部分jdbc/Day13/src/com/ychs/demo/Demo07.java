/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��12������2:31:04 ;
 */
public class Demo07 {
public static void main(String[] args) {
	try {
		int i=1/0;
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  //��ӡ�쳣�Ķ�ջ��Ϣ
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		
	}
}
}
