/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 *	traffic
 *   @date: 2021年7月29日上午10:36:11 ;
 */
public class Demo05 {
	public static void main (String[] args)  {
		TrafficDemo05 light =	TrafficDemo05.Red;   //枚举类型
		// switch ：后面的表达式 只能是 int， String,enum 类型
		//（char， byte，short可以自动提升成int 类型，也可以使用）
		//case 后面是常量表达式
		//default 位置可以随便放 case前或者后
		//break使用要符合要求
		switch(light) {
		case Red:System.out.println("红灯");
		default:System.out.println("不合法");
		case Green:System.out.println("绿灯");
		case Yellow:System.out.println("黄灯");
		
		}
	}
}
