/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *	�����ֵ��Сֵ
 *   @date: 2021��7��30������2:43:52 ;
 */
public class MaxMin {
	public static void main (String[]args) {   
		int[] arr2 = {93,89,80,71,78};
		
		int min=arr2[0];             //  ���
		int max=0;                 // �����ֵ
		for (int i:arr2) {

			if(i>max) {
				max=i;
			}
			if(i<min) {
				min=i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
