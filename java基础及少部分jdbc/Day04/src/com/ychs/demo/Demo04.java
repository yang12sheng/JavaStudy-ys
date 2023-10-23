/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *        同一个类中，成员方法能直接调用成员方法，也能调用 static 方法但是 static 不能直接调用成员方法 
 *        需要通过创建对象的形式调用，
 *   static方法能直接调用static方法
 *   不同类中调用成员方法需要通过对象调用 调用静态方法正常使用类名调用
 *   @date: 2021年7月30日上午10:13:53 ;
 */
public class Demo04 {
	public void f(int a) {      //形参
		a++;
			System.out.println(a);
	}
	public static void main (String[]args) {
		int a=5;
		Demo04 d=new Demo04();
		d.f(a);
		System.out.println("...."+a);
	}
	public void f1() {
		f(2);
	}
}
