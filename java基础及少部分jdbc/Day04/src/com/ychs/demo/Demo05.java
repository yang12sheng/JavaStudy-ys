/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *递归调用   自己调用自己 但是得有结束递归的条件
 * n！
 *   @date: 2021年7月30日上午10:26:40 ;
 */
public class Demo05 {
	public int f(int n) {
		if(n==1) {
			return 1;
		}
		return n*f(n-1);
	}
	public static void main (String[]args) {
		Demo05 d = new Demo05();
		System.out.println(d.f(3));
	}
}
