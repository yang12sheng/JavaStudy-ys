/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *�ݹ����   �Լ������Լ� ���ǵ��н����ݹ������
 * n��
 *   @date: 2021��7��30������10:26:40 ;
 */
public class Demo05 {
	public int f(int n) {
		if(n==1) {
			return 1;
		}
		return n*f(n-1);
	}
	public static void main (String[]args) {
		Demo05 d = new Demo05();
		System.out.println(d.f(3));
	}
}
