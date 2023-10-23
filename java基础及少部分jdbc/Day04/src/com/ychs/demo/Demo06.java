/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *  
 *   @date: 2021年7月30日上午10:33:46 ;
 */
public class Demo06 {
	public int f(int a,int b) {      //求最大值
		
		return a>b?a:b ;
	}
	
	public int f1(int m,int n) {          //求和
		
		return m+n ;
	}
	public int f2(int n) {              //判断是否为素数
	int i;
	if(n%2==0) return 0;
	else {
	for(i=3;i<n/2;i++)
	if(n%i==0) return 0; //0不是
	return 1;           // 1 是 素数
	}}
	

	public static void main (String[]args) {
		Demo06 d = new Demo06();
		System.out.println(d.f(3,4));
		System.out.println(d.f1(3,4));
		System.out.println(d.f2(21));
	}
}

