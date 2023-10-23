/**
 *  @version:
 */
package com.ychs.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日上午9:31:47 ;
 */
public class Demo01FileOutputstream {
	public static void main(String[] args) throws IOException {
		//输出流  写出去
		FileOutputStream fos = new FileOutputStream("e:\\ychs\\a.txt");
		fos.write("hello".getBytes());//  -->byte[]
		fos.close();
	}
}
