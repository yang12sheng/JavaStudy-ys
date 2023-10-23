/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 * 统计小组销售额
 *   @date: 2021年7月30日下午4:23:42 ;
 */
public class RenWu2 {
	public static void main(String[] args) {
		
		int[][] arr1= {{11,12},{21,22,23},{31,32,33,34}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0, sum=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" "); //  ln  换行
			sum=sum+arr1[i][j];
			System.out.println(sum); 	
			}
			System.out.println();
		}
}}
