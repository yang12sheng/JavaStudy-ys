/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月16日上午9:54:41 ;
 */
public class Demo02Test {
public static void main(String[] args) {
	Demo02 demo =new Demo02();
	//线程类
	Thread t = new Thread(demo);
	t.start();                 //启动一个线程
	for(int i=0;i<10;i++) {
		//获取当前线程的名称
		System.out.println(Thread.currentThread().getName()+",,"+i);
	}
}
}
