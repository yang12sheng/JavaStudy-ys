/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 *
 *   @date: 2021��7��29������4:09:31 ;
 */
public class Person {
	int age;
	@Override         // ��дobject ��          alt /
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.age==p.age;   // this ��ʾ��ǰ����
	}
}
