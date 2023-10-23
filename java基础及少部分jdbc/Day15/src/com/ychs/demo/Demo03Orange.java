/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月16日上午10:14:48 ;
 */
public class Demo03Orange  extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int num =20;
		while(true) {
		if(num<=0) {
			break;
		}else {num--;
			System.out.println(Thread.currentThread().getName()+",,"+num);
		}
	}
}}
