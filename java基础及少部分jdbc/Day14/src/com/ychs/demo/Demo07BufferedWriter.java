/**
 *  @version:
 */
package com.ychs.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��13������2:14:07 ;
 */
public class Demo07BufferedWriter {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			bw = new BufferedWriter(new FileWriter("e:\\c.txt"));
			br = new BufferedReader(new FileReader(new File("e:\\c.txt")));
			
			bw.write("̫ԭ�Ƽ���ѧ");
			bw.write("\nhahaha");
			bw.append("Ц");
			bw.flush();
			String str=null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		try {
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}}
