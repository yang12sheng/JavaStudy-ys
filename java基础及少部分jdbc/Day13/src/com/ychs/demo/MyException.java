/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *�Զ����쳣�ࣺ
 *1.�̳�exception ��������
 *2.�޲εĹ��췽��           ���вεĹ��췽��
 *   @date: 2021��8��12������2:37:11 ;
 */
//public class MyException extends  RuntimeException{
	public class MyException extends  Exception{
	public MyException() {
	
	}
	public MyException(String msg) {
		super(msg);
	}

}


