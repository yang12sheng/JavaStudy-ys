/**
 *  @version:
 */
package com.ychs.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Ysheng
 *对于异常的处理  一种 try catch  进行捕获处理   第二种  把异常扔出去交给调用者处理
 *throw：  手动抛出一个异常  方法的声明上
 *throws：声明一个异常   用在方法的声明上       ：告诉父类 我的方法内部可能发生该异常
 *   @date: 2021年8月12日上午10:41:15 ;
 */
public class Demo05 {
	public static void main(String[] args) {
		
		try {
			SimpleDateFormat sf= new SimpleDateFormat("ffff");
			sf.parse("aaaa");
			Class.forName("com.ychs.demo.demo11");
//			System.exit(0);
			int i =1/0;  //运行时期异常  代码里不用管
		} catch (ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();          //打印堆栈的信息  打印异常的详细信息
			throw new Exception(e);                //手动抛出一个异常
			throw new RuntimeException(e); //抛出运行时期异常
		}
		
//		try {
//			int[] arr = null;
//			System.out.println(arr[0]);
//			int i=1/0;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
