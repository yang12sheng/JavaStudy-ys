/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *����Ĺ������
 *���� ������飬��̬����飬���췽���� һ�㷽����
 *   @date: 2021��8��2������11:01:56 ;
 */
public class Demo05 {
	private String name;
	private int age = getAge();
	//��ͨ�����
	//���췽��ִ��һ��   ��ͨ�Ĵ����Ҳִ��һ��
	{
		System.out.println("��ͨ�����");
	}
	public Demo05() {
		System.out.println("�޲ι��췽��");
	}
	public Demo05(String name,int age) {
		System.out.println("�в����Ĺ��췽��");
		this.name=name;
		this.age=age;
	}
	public int  getAge() {
		System.out.println("����get������ֵ");
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
