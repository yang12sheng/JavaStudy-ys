/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��2������10:37:15 ;
 */
public class Car {
	private String color; //������ɫ
	private int shu;    //��̥����
	public Car() {}
	public Car(String color, int shu) {
		super();
		this.color = color;
		this.shu = shu;
	}
	public void show() {
		System.out.println("������ɫ�� " +color+"����̥������"+shu);
	}
	public void start() {
		System.out.println("����");
	}
	public void end() {
		System.out.println("ֹͣ");
	}
}
