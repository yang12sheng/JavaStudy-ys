/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月16日上午10:20:20 ;
 */
public class Demo04 {
public static void main(String[] args) {
	Demo04Orange d=new Demo04Orange();
	
	Thread t1 = new Thread(d);
	Thread t2= new Thread(d);
	t1.start();
	t2.start();
}
}
