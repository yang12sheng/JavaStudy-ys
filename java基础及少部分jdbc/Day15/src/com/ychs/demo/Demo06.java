/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��16������11:06:01 ;
 */
public class Demo06 extends Thread{
	private static int num = 10;
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
			if(num<=0) {
				break;
			}
			System.out.println(Thread.currentThread().getName()+",,"+(--num));
			if(num==5) {
				System.out.println(Thread.currentThread().getName()+"---"+(num));
				Thread.yield();  //�߳���λ   �ó� cpu
			}
		}
}
	}
