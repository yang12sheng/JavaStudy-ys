/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *	求最大值最小值
 *   @date: 2021年7月30日下午2:43:52 ;
 */
public class MaxMin {
	public static void main (String[]args) {   
		int[] arr2 = {93,89,80,71,78};
		
		int min=arr2[0];             //  求和
		int max=0;                 // 求最大值
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
