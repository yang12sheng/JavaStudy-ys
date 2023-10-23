/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *匿名内部类
 *   @date: 2021年8月16日上午10:47:38 ;
 */
public class Demo05 {
	public static void main(String[] args) {
		Thread t	=new Thread() {
			@Override
			public void run() {
				
				for(int i=0;i<10;i++) {
					System.out.println("...."+i);
				}
			}
		
	};
	t.start();
	
	new Thread(new Runnable() {
		@Override
		public void run() {
			
			for(int i=0;i<10;i++) {
				System.out.println(",,,,"+i);
			}
		}
	}).start();
}}
