/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��16������11:10:51 ;
 */
public class Demo06Test {
public static void main(String[] args) throws InterruptedException {
	Demo06 t1 = new Demo06();
	Demo06 t2 = new Demo06();
	//��������Լ��ṩ�߳�����  ������ṩ ϵͳ�Զ����߳�һ������
	t1.setName("zx");
	t2.setName("lisi");  //�����߳�����
	t1.setPriority(9);   //�����̵߳����ȼ�   0-10    ֵԽ��  ���ȼ�Խ��
	
	t1.start();
	t1.join();// �̼߳��� ��һ���߳�ִ����
	t2.start();
}
}
