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
 *   @date: 2021��8��13������9:31:47 ;
 */
public class Demo01FileOutputstream {
	public static void main(String[] args) throws IOException {
		//�����  д��ȥ
		FileOutputStream fos = new FileOutputStream("e:\\ychs\\a.txt");
		fos.write("hello".getBytes());//  -->byte[]
		fos.close();
	}
}
