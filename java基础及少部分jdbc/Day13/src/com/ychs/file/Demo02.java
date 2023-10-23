/**
 *  @version:
 */
package com.ychs.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Ysheng
 *�г�ָ���ļ���Ŀ¼
 *   @date: 2021��8��12������4:02:00 ;
 */
public class Demo02 {
	public static void main(String[] args) {
		File file = new File("e:\\ychs");
		File[] files=file.listFiles();
		for (File s : files) {
			System.out.println(s);
			System.out.println(s.isDirectory());
		}
		
		
		
		//�г��ĵ�ǰ��file�µ������ļ����ļ���
		String[] list=file.list();
		for (String s : list) {
			System.out.println(s);
		}
		String[] list2 = file.list(new FilenameFilter() {  // ���ض��� ctrl 2  l
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				System.out.println("---------"+dir);
				System.out.println(name);
				
				return name.endsWith(".txt");       //�� xxx  ��β
			}
		});
		System.out.println("---------------------------------------");
		for (String s : list2) {
			System.out.println(s);
		}
	}
}
