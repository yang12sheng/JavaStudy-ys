/**
 *  @version:
 */
package com.ychs.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��12������3:43:58 ;
 */
public class Demo01 {
	//     \ ת ���ַ�   
	public static void main(String[] args) throws IOException {
		File file = new File("e:\\ychs");
		if(!file.exists()) {             //�жϸ�Ŀ¼�Ƿ���� 
			file.mkdir();              //ֻ����һ��Ŀ¼
		//	file.mkdirs();             //�����༶Ŀ¼
			
			File file2= new File(file,"a.txt");
			file2.createNewFile();     //�����ļ�
			System.out.println(file2.isFile());//true
		
			System.out.println(file2.isDirectory());	//false
		}else {
			file.delete();
		}
	}
}
