/**
 *  @version:
 */
package com.ychs.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import com.sun.xml.internal.ws.Closeable;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日上午9:37:44 ;
 */
public class Demo02Input {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File("e:\\ychs\\a.txt"));
		int c=0;
//		while((c=fis.read())!=-1) {
//			System.out.println(c);
//			System.out.println((char)c);
//			
//		}fis.close();//关闭流
		
		byte[] b = new byte[1024];
		int len =0;
		while((len=fis.read(b))!=-1) {
			System.out.println(Arrays.toString(b));
			System.out.println(new String(b));
		}
	}
}
