/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *对象的构造次序
 *属性 ，代码块，静态代码块，构造方法， 一般方法，
 *   @date: 2021年8月2日上午11:01:56 ;
 */
public class Demo05 {
	private String name;
	private int age = getAge();
	//普通代码块
	//构造方法执行一次   普通的代码块也执行一次
	{
		System.out.println("普通代码块");
	}
	public Demo05() {
		System.out.println("无参构造方法");
	}
	public Demo05(String name,int age) {
		System.out.println("有参数的构造方法");
		this.name=name;
		this.age=age;
	}
	public int  getAge() {
		System.out.println("调用get方法赋值");
		return 12;
	}
	@Override
	public String toString() {
		return "Demo05 [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Demo05 d3 = new Demo05();
		System.out.println("=========");
		Demo05 d31=new Demo05("zs",18);
		System.out.println(d31);
	}
}
