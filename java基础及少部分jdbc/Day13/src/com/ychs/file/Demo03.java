/**
 *  @version:
 */
package com.ychs.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��12������4:24:45 ;
 */
public class Demo03 {
	public static void main(String[] args) throws IOException {
	//	File file = new File("aaa"); // ��ǰ·���´���    day 13 ��
		File file = new File("e:\\ychs\\a.txt"); // ��ǰ·���´���    day 13 ��
		
		System.out.println(file.length());
		System.out.println(file.lastModified());
		file.createNewFile();
		file.getAbsolutePath();
		file.getPath();
	}
}
