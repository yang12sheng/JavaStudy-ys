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
 *   @date: 2021年8月13日下午2:14:07 ;
 */
public class Demo07BufferedWriter {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			bw = new BufferedWriter(new FileWriter("e:\\c.txt"));
			br = new BufferedReader(new FileReader(new File("e:\\c.txt")));
			
			bw.write("太原科技大学");
			bw.write("\nhahaha");
			bw.append("笑");
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
