package com.ychs.demo;

public class Demo04 {
	public static void main(String[] args) {
	try {
		//try �п��ܷ����쳣�Ĵ���  catch ��Ҫ�����쳣
	//	2.catch �����ж�������쳣һ��Ҫ�������쳣����  Exceptions �������쳣�ĸ����쳣 
	int i=1/0;
	int[] arr =null;
	System.out.println(arr[1]);
	
	}
catch(Exception e) {
	System.out.println("���쳣");
	}
	finally {
		System.out.println("�����쳣��Ҫִ��");
	}
	}
}
