/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Arrays;

/**
 * @author Ysheng
 *�� student     ѧ��
 *   @date: 2021��7��30������3:01:34 ;
 */
public class Demo10 {
	public static void main(String[] args) {
		Student[] stus = new Student[2];
		System.out.println(Arrays.toString(stus));
		
		Student  s1 = new Student(1001,"����ɭ");
		Student  s2 = new Student(1002,"�۱���");
		stus[0]=s1;  //�����鸳ֵ
		stus[1]=s2;
		System.out.println(Arrays.toString(stus));
	//	System.out.println(stus[5]);// java.lang.ArrayIndexOutOfBoundsException: 5 �����±�Խ���쳣
	stus = null;
	System.out.println(stus[0]);// java.lang.NullPointerException ��ָ���쳣
	
	Student s3=null;
	System.out.println(s3.getSno());  // ��ָ���쳣

		
	}
}
