/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *数组 的遍历
 *
 *   @date: 2021年7月30日下午2:29:53 ;
 */
public class Demo09 {
	public static void main (String[]args) {       //main   alt /
		String[ ] arr = {"a","b","c","ddd"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//增强型for循环
		for(String s:arr) {
			System.out.println(s);
		}
		System.out.println("------------------");
		int[] arr2 = {3,9,8,11,7,1};
		int sum=0;               //  求和
		int max=0;                 // 求最大值
		for (int i:arr2) {
			sum=sum+i;
			if(i>max) {
				max=i;
			}
		}
		System.out.println(sum);
		System.out.println(max);
	}
}
