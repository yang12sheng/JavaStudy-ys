/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 * ͳ��С�����۶�
 *   @date: 2021��7��30������4:23:42 ;
 */
public class RenWu2 {
	public static void main(String[] args) {
		
		int[][] arr1= {{11,12},{21,22,23},{31,32,33,34}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0, sum=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" "); //  ln  ����
			sum=sum+arr1[i][j];
			System.out.println(sum); 	
			}
			System.out.println();
		}
}}
