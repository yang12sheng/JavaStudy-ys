/**
 *  @version:
 */
package com.ychs.demo;

import java.util.LinkedList;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日下午2:42:00 ;
 */
public class Demo08 {
	private static LinkedList<Student03> pool = new LinkedList<Student03>();
	static {
		Student03 stu = new Student03("12","sz",12);
		Student03 stu2 = new Student03("12","sz",12);
		pool.add(stu2);
		pool.add(stu);
	}
	public static Student03 getStu() {
		if(!pool.isEmpty()) {
		return pool.removeFirst();
		}
		return null;
	}
	public static void addStu(Student03 stu) {
		pool.addLast(stu);
	}
	public static void main(String[] args) {
		System.out.println(pool);
		System.out.println(getStu());
		System.out.println(getStu());
		System.out.println(getStu());
	}
}
