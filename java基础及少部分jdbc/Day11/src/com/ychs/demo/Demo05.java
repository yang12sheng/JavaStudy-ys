/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ysheng
 *�����list ��ת��
 *   @date: 2021��8��10������11:20:58 ;
 */
public class Demo05 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Integer[] arr1= {1,2,3,4,5};
		//array --->list
	List<int[]> list = 	Arrays.asList(arr);
	List<Integer> list1 = Arrays.asList(arr1);
	System.out.println(list);
	System.out.println(list1);
	
	
	//list---��array
	Integer[] array=(Integer[])list.toArray();
	System.out.println(Arrays.toString(array));
	}
}
