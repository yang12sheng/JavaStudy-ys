package com.ychs.demo;

public class Demo01Test {
public static void main(String[] args) {
	//�����̶߳���
	Demo01Thread t1 = new Demo01Thread ();
	//����һ���߳�
//	t1.run();  //run������ͨ����ִ��  �������߳�  ֻ��һ�����߳�
	t1.start();	
	
	for(int i=0;i<10;i++) {
		//��ȡ��ǰ�̵߳�����
		System.out.println(Thread.currentThread().getName()+","+i);
	}
	
	
	
}
}
