/**
 *  @version:
 */
package com.ychs.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日上午11:19:31 ;
 */
public class Demo06BufferedOutputStream {
	public static void main(String[] args)  {
		BufferedOutputStream bos = null;
		BufferedInputStream bis =null;
		try {
			bos = new BufferedOutputStream(
					new FileOutputStream(new File("e:\\a.txt")));
			bis = new BufferedInputStream(
					(new FileInputStream("e:\\a.txt")));
			bos.write("欢迎你呀".getBytes());
			bos.flush();
			byte[] b = new byte[1024];
			int len=0;
			while((len=bis.read(b))!=-1) {
				String s =new String(b,0,len);
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
				
	}
}
