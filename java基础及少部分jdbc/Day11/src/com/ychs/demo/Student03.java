/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日上午10:17:28 ;
 */
public class Student03 {
	private String sno;
	private String sname;
	private Integer age;
	
	public Student03(String sno, String sname, Integer age) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	public Student03() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
   
}
