/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *学员类    
 *   @date: 2021年8月2日上午10:49:57 ;
 */
public class Ucze {
	private String name; 
	private String age;   
	private String cname;
	private String hobby;
	
	
	
	
	public Ucze(String name, String age, String cname, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.cname = cname;
		this.hobby = hobby;
	}




	@Override
	public String toString() {
		return "Ucze [name=" + name + ", age=" + age + ", cname=" + cname + ", hobby=" + hobby + "]";
	}




	public static void main(String[] args) {
		Ucze stu = new Ucze("haha","18","3班","篮球");
		System.out.println(stu);
	}
}
