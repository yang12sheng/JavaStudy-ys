/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日上午10:27:09 ;
 */
public class Demo03 {
	public static void main(String[] args) {
		List<Student03> list = new ArrayList<Student03>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("sno");
			String sno = sc.next();		
			System.out.println("sname");
			String sname = sc.next();		
			Student03 stu = new Student03();
			stu.setSname(sname);
			stu.setSno(sno);
			list.add(stu);
		}
		//foreach 遍历
		for(Student03 stu:list) {
			System.out.println(stu.getSname()+stu.getSno()+stu.getAge());
		}
		
		
		//System.out.println(list);
	}
}
