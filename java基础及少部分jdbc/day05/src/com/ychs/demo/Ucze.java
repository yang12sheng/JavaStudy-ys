/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *ѧԱ��    
 *   @date: 2021��8��2������10:49:57 ;
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
		Ucze stu = new Ucze("haha","18","3��","����");
		System.out.println(stu);
	}
}
