/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月16日上午10:19:37 ;
 */
public class Demo04Orange implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int num =20;
		while(true) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			e.printStackTrace();
			}
		if(num<=0) {
			break;
		}else {num--;
			System.out.println(Thread.currentThread().getName()+",,"+num);
		}
	}
}
}
