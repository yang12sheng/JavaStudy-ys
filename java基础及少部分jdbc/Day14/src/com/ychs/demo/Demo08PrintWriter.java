/**
 *  @version:
 */
package com.ychs.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ysheng
 *��ӡ��
 *   @date: 2021��8��13������2:31:59 ;
 */
public class Demo08PrintWriter {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<String> list =new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		PrintWriter pw = new PrintWriter(new File("e:\\d.txt"));
	
		pw.write("���");
		pw.append("ɽ��");	
		pw.print(list);
		pw.print(new Date());
		pw.close();
	}
}
