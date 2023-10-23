package com.ychs.demo;

public class Demo03 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4};
	int res = f(arr);
	System.out.println(res);
}
public static int f(int[] arr) {
	System.out.println(arr[5]);
	return arr[0];     
}
}
