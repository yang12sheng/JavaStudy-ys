/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *        ͬһ�����У���Ա������ֱ�ӵ��ó�Ա������Ҳ�ܵ��� static �������� static ����ֱ�ӵ��ó�Ա���� 
 *        ��Ҫͨ�������������ʽ���ã�
 *   static������ֱ�ӵ���static����
 *   ��ͬ���е��ó�Ա������Ҫͨ��������� ���þ�̬��������ʹ����������
 *   @date: 2021��7��30������10:13:53 ;
 */
public class Demo04 {
	public void f(int a) {      //�β�
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
