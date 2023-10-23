/**
 *  @version:
 */
package com.ychs.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Ysheng
 *列出指定文件和目录
 *   @date: 2021年8月12日下午4:02:00 ;
 */
public class Demo02 {
	public static void main(String[] args) {
		File file = new File("e:\\ychs");
		File[] files=file.listFiles();
		for (File s : files) {
			System.out.println(s);
			System.out.println(s.isDirectory());
		}
		
		
		
		//列出的当前该file下的所有文件和文件夹
		String[] list=file.list();
		for (String s : list) {
			System.out.println(s);
		}
		String[] list2 = file.list(new FilenameFilter() {  // 返回东西 ctrl 2  l
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				System.out.println("---------"+dir);
				System.out.println(name);
				
				return name.endsWith(".txt");       //以 xxx  结尾
			}
		});
		System.out.println("---------------------------------------");
		for (String s : list2) {
			System.out.println(s);
		}
	}
}
