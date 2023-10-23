/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Arrays;

/**
 * @author Ysheng
 *数组
 *   @date: 2021年7月30日下午2:20:07 ;
 */
public class Demo08 {
	public static void main (String[]args) {
		
	//静态初始化
		int[] arr1 = new int[] {1,2,3,4	};
		System.out.println(arr1);
		int[] arr2 = {3,4,5};
		System.out.println(arr1.length);
		//动态初始化   
		// 初始化数组默认是有初始值的 int  是   0 0.0   布尔型  是false 默认
		int[] arr3 = new int [2];
		System.out.println(Arrays.toString(arr3));
		//数组访问 通过  index 访问
		System.out.println(arr3[1]);
}}
