/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月16日上午9:53:28 ;
 */
public class Demo02 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			//获取当前线程的名称
			System.out.println(Thread.currentThread().getName()+",,"+i);
		}
	}
}
