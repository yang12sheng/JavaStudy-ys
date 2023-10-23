/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
	 *`28日上午11:40:51 ;
 */
public class MiaoZhuan {
	 public static void main (String[] args)  {
		 int seconds1 = 13467;
	        int h = seconds1 / 3600;
	        int m = (seconds1 % 3600) / 60;
	        int s = (seconds1 % 3600) % 60;
	        System.out.println (h + "小时" + m + "分" + s + "秒");
	    }

}
