/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月2日上午10:37:15 ;
 */
public class Car {
	private String color; //汽车颜色
	private int shu;    //轮胎个数
	public Car() {}
	public Car(String color, int shu) {
		super();
		this.color = color;
		this.shu = shu;
	}
	public void show() {
		System.out.println("汽车颜色： " +color+"，轮胎个数："+shu);
	}
	public void start() {
		System.out.println("运行");
	}
	public void end() {
		System.out.println("停止");
	}
}
