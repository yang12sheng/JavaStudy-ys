/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��16������9:53:28 ;
 */
public class Demo02 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			//��ȡ��ǰ�̵߳�����
			System.out.println(Thread.currentThread().getName()+",,"+i);
		}
	}
}
