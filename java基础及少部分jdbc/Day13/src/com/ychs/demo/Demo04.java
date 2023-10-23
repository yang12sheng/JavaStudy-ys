package com.ychs.demo;

public class Demo04 {
	public static void main(String[] args) {
	try {
		//try 有可能发生异常的代码  catch 是要捕获异常
	//	2.catch 可以有多个父类异常一定要在子类异常下面  Exceptions 是所有异常的父类异常 
	int i=1/0;
	int[] arr =null;
	System.out.println(arr[1]);
	
	}
catch(Exception e) {
	System.out.println("大异常");
	}
	finally {
		System.out.println("有无异常都要执行");
	}
	}
}
