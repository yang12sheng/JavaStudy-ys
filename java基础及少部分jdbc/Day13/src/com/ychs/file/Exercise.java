/**
 *  @version:
 */
package com.ychs.file;

import java.io.File;
import java.io.IOException;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月12日下午4:38:16 ;
 */
public class Exercise {
	public static void main(String[] args)throws IOException {
		File file = new File("e:\\ychs");
		getFileAll(file);
	}

	/**
	 * @param file
	 */
	private static void getFilevcAll(File file) {
		// TODO Auto-generated method stub
		File[] files=file.listFiles();
		for (File s : files) {
//			System.out.println(s);
//			System.out.println(s.isDirectory());
			if(s.isDirectory()) {
				getFileAll(s);
			}else {
				System.out.println(s);
			}
		}
		
	}

	/**
	 * 
	 */
	
}
