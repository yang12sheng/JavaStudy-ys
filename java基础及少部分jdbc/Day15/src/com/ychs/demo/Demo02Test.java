/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��16������9:54:41 ;
 */
public class Demo02Test {
public static void main(String[] args) {
	Demo02 demo =new Demo02();
	//�߳���
	Thread t = new Thread(demo);
	t.start();                 //����һ���߳�
	for(int i=0;i<10;i++) {
		//��ȡ��ǰ�̵߳�����
		System.out.println(Thread.currentThread().getName()+",,"+i);
	}
}
}
