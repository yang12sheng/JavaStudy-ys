/**
 *  @version:
 */
package com.ychs.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月12日下午4:24:45 ;
 */
public class Demo03 {
	public static void main(String[] args) throws IOException {
	//	File file = new File("aaa"); // 当前路径下创建    day 13 下
		File file = new File("e:\\ychs\\a.txt"); // 当前路径下创建    day 13 下
		
		System.out.println(file.length());
		System.out.println(file.lastModified());
		file.createNewFile();
		file.getAbsolutePath();
		file.getPath();
	}
}
