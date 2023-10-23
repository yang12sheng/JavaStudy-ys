/**
 *  @version:
 */
package com.ychs.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月12日下午3:43:58 ;
 */
public class Demo01 {
	//     \ 转 义字符   
	public static void main(String[] args) throws IOException {
		File file = new File("e:\\ychs");
		if(!file.exists()) {             //判断该目录是否存在 
			file.mkdir();              //只创建一级目录
		//	file.mkdirs();             //创建多级目录
			
			File file2= new File(file,"a.txt");
			file2.createNewFile();     //创建文件
			System.out.println(file2.isFile());//true
		
			System.out.println(file2.isDirectory());	//false
		}else {
			file.delete();
		}
	}
}
