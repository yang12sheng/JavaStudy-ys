/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *二维数组
 *   @date: 2021年7月30日下午3:47:05 ;
 */
public class Demo11 {
public static void main(String[] args) {
	
	int[][] arr =new int[3][];
	System.out.println(arr[0]);//null
	System.out.println("-----------------");
	arr[0]= new int[2];
	arr[1]= new int[1];
	arr[2]= new int[3];
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" "); //  ln  换行
		}
		System.out.println();
	}
	
	//初始化数组方式1
//	int[][] arr1 =new int[3][2];
//	System.out.println(arr1[0]); //[I@15db9742
//	System.out.println(arr1[0][0]);//0
//	arr1[1][1]=3;
//	arr1[2][1]=4;
	//初始化二维数组方式2
	int[][] arr1 = {{0,2},{0,3},{0,4,5}};
	
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j]+" "); //  ln  换行
		}
		System.out.println();
	}
}
}
