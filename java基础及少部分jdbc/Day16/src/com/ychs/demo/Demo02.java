/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��17������9:41:50 ;
 */
public class Demo02 {
public static void main(String[] args) throws ClassNotFoundException {
	Person p = new Person();
	Class<? extends Person> c1= p.getClass();
	System.out.println(c1);
	//���� ���� ��class
	Class c2 = Person.class;
	System.out.println(c2);
	//����class��forName���ַ�����
	Class c3 = Class.forName("com.ychs.demo.Person");
	System.out.println(c3);

}
}
