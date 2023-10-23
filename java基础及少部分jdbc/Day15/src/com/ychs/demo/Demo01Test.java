package com.ychs.demo;

public class Demo01Test {
public static void main(String[] args) {
	//创建线程对象
	Demo01Thread t1 = new Demo01Thread ();
	//启动一个线程
//	t1.run();  //run看成普通方法执行  不开启线程  只有一个主线程
	t1.start();	
	
	for(int i=0;i<10;i++) {
		//获取当前线程的名称
		System.out.println(Thread.currentThread().getName()+","+i);
	}
	
	
	
}
}
