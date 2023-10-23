/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午10:00:04 ;
 */
public class Student {
	private String sno;
	private String sname;
	private int age;
	
	private double score;
	public Student(String sno, String sname, int age, double score) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.age = age;
		this.score = score;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", age=" + age + ", score=" + score + "]";
	}
}
