/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��2������9:41:53 ;
 */
public class Demo02Person {
	public static void main(String[] args) {
	// ջ�ж��������ָ����ڴ�ռ�
		Person p1 = new Person(18,'f');
		p1.show();
		p1.setAge(12);
		p1.setIdenfied("12121212");
		p1.setName("zs");
		p1.show();
		
		//alt shift a   ѡ�� ����  һ���
		Person p2 = new Person(18,'m');
		p2.setAge(18);
		p2.setIdenfied("1212112121545");
		p2.setName("gkjjk");
		p2.show();
		
		
	}
}
