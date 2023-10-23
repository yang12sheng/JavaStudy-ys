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
 *   @date: 2021��8��13������10:26:54 ;
 */
public class Demo04StreamReader {
	public static void main(String[] args) throws IOException {
		//ת���� ���ֽ���תΪ�ַ���
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\a.txt"),"gbk");
		InputStreamReader isr = new InputStreamReader
				(new FileInputStream("e:\\a.txt"),"utf-8");
		//���ڻ�����������д������ʱ����д������������ȥ��Ȼ�����ر�  ��ʱ��� ������������д��ȥ
		osw.write("��ӭ��");
		osw.flush(); //�ѻ����е�����ˢ�����ļ���
		char[] cbuf = new char[1024];
		int len=0;
		while((len=isr.read(cbuf))!=-1) {
			String s = new String(cbuf,0,len);
			System.out.println(s);
			
		};isr.close();osw.close();
		
	}
}

