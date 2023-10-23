/**
 *  @version:
 */
package com.ychs.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日上午10:26:54 ;
 */
public class Demo04StreamReader {
	public static void main(String[] args) throws IOException {
		//转换流 把字节流转为字符流
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\a.txt"),"gbk");
		InputStreamReader isr = new InputStreamReader
				(new FileInputStream("e:\\a.txt"),"utf-8");
		//对于缓冲流：往外写东西的时候，先写到缓存区里面去，然后流关闭  的时候把 缓冲区的数据写出去
		osw.write("欢迎您");
		osw.flush(); //把缓冲中的数据刷出到文件中
		char[] cbuf = new char[1024];
		int len=0;
		while((len=isr.read(cbuf))!=-1) {
			String s = new String(cbuf,0,len);
			System.out.println(s);
			
		};isr.close();osw.close();
		
	}
}

