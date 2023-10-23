/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月16日上午11:10:51 ;
 */
public class Demo06Test {
public static void main(String[] args) throws InterruptedException {
	Demo06 t1 = new Demo06();
	Demo06 t2 = new Demo06();
	//程序可以自己提供线程名称  如果不提供 系统自动给线程一个名字
	t1.setName("zx");
	t2.setName("lisi");  //设置线程名称
	t1.setPriority(9);   //设置线程的优先级   0-10    值越大  优先级越高
	
	t1.start();
	t1.join();// 线程加入 第一个线程执行完
	t2.start();
}
}
