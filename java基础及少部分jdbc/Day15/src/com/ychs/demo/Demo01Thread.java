package com.ychs.demo;

public class Demo01Thread extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<10;i++) {
		//获取当前线程的名称
		System.out.println(Thread.currentThread().getName()+","+i);
	}
}
}
