/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *1.��д�� ����������һ���쳣�������������������쳣�� ������ �����쳣�����쳣    ��������ʲôҲ ������  ��
 *�����쳣�ĸ��쳣��
 *2.��������������˶���쳣�����������������ĳһ���쳣
 *3.���������û�������쳣�����������쳣 ֻ���� try catch �Լ��ڲ��������catch���治�봦��   
 *�ܲ����ֶ��׳�һ�� ����ʱ�쳣��  ��
 *   @date: 2021��8��12������2:11:07 ;
 */
public class Demo06fu {
	public void f1() throws NullPointerException{
		System.out.println("f1...");
	}
	public void f2() throws Exception{
		System.out.println("f2...");
	}
	
	public void f3() throws NullPointerException,ArrayIndexOutOfBoundsException{
		System.out.println("f3...");
	}
	
	public void f4() throws ArrayIndexOutOfBoundsException{
		System.out.println("f4...");
	}
	public void f6() {
	
	}
	
}
