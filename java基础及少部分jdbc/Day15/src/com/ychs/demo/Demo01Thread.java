package com.ychs.demo;

public class Demo01Thread extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<10;i++) {
		//��ȡ��ǰ�̵߳�����
		System.out.println(Thread.currentThread().getName()+","+i);
	}
}
}
