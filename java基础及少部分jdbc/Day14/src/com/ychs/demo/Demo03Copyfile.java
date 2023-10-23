/**
 *  @version:
 */
package com.ychs.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日上午9:48:36 ;
 */
public class Demo03Copyfile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("e:\\ychs\\a.txt");
		FileOutputStream fos = new FileOutputStream(new File("f:\\a.txt"));
		byte[] buf = new byte[1024];
		int len =0;
		while((len=fis.read(buf))!=-1) {
			// byte[] ---> String
			String s = new String(buf,0,len);
			System.out.println(s);
			fos.write(buf,0,len);
		}
		fos.close();
		fis.close();
	}
}
