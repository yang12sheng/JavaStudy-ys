/**
 *  @version:
 */
package com.ychs.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��13������10:51:39 ;
 */
public class Demo05FileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("e:\\a.txt");
		int ch=0;
		while((ch=fr.read())!=-1) {
			System.out.println(ch);
			System.out.println((char)ch);
			
		}fr.close();
	}
}
