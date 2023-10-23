/**
 *  @version:
 */
package com.ychs.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Ysheng
 *编译时期异常
 *   @date: 2021年8月12日上午9:52:26 ;
 */
public class Demo02 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyy");
	//	sf.parse("aaa"); 
		sf.parse("2021");
		int a= 1;int b=0;
	//	System.out.println(a/b);           运行时异常
	}
}
