/**
 *  @version:
 */
package com.ychs.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��13������10:14:17 ;
 */
public class Demo04 {
	public static void main(String[] args) throws IOException {
		//�����  д��ȥ
		FileOutputStream fos = new FileOutputStream("e:\\ychs\\a.txt");
		FileInputStream fis=new FileInputStream(new File("e:\\ychs\\a.txt"));
		
		fos.write("yingcaikeji".getBytes());
		
		int c=0;
		while((c=fis.read())!=-1) {
			System.out.println(c);
			System.out.println((char)c);
			
		}fis.close();//�ر���
		
	fos.close();
	
	}
}