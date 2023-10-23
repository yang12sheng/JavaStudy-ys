/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月16日下午2:10:27 ;
 */
public class Demo07Test {
	public static void main(String[] args) {
		Demo07Ticket t1 = new Demo07Ticket();
		Demo07Ticket t2 = new Demo07Ticket();
		Demo07Ticket t3 = new Demo07Ticket();
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
