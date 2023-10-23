/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 * 交换
 *   @date: 2021年8月2日下午4:00:03 ;
 */
public class Demo07 {
	public void change(int a, int b,Dept d) {
		int t=a;
		a=b;
		b=t;
		d.setDname("yuci");
	}
	public static void main(String[] args) {
		Demo07 d= new Demo07();
		int a =3;
		int b= 4;
		Dept dept = new Dept();
		dept.setDname("taiyuan");
		
		d.change(a,b,dept);
		System.out.println(a+","+b);
		System.out.println(dept);
}
}
