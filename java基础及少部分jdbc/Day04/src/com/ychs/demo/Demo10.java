/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Arrays;

/**
 * @author Ysheng
 *配 student     学生
 *   @date: 2021年7月30日下午3:01:34 ;
 */
public class Demo10 {
	public static void main(String[] args) {
		Student[] stus = new Student[2];
		System.out.println(Arrays.toString(stus));
		
		Student  s1 = new Student(1001,"富樫森");
		Student  s2 = new Student(1002,"苒爆肝");
		stus[0]=s1;  //给数组赋值
		stus[1]=s2;
		System.out.println(Arrays.toString(stus));
	//	System.out.println(stus[5]);// java.lang.ArrayIndexOutOfBoundsException: 5 数组下标越界异常
	stus = null;
	System.out.println(stus[0]);// java.lang.NullPointerException 空指针异常
	
	Student s3=null;
	System.out.println(s3.getSno());  // 空指针异常

		
	}
}
