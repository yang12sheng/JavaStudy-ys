/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Arrays;

/**
 * @author Ysheng
 *����
 *   @date: 2021��7��30������2:20:07 ;
 */
public class Demo08 {
	public static void main (String[]args) {
		
	//��̬��ʼ��
		int[] arr1 = new int[] {1,2,3,4	};
		System.out.println(arr1);
		int[] arr2 = {3,4,5};
		System.out.println(arr1.length);
		//��̬��ʼ��   
		// ��ʼ������Ĭ�����г�ʼֵ�� int  ��   0 0.0   ������  ��false Ĭ��
		int[] arr3 = new int [2];
		System.out.println(Arrays.toString(arr3));
		//������� ͨ��  index ����
		System.out.println(arr3[1]);
}}
