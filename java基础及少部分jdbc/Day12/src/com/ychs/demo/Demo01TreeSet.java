/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��11������9:24:48 ;
 */
public class Demo01TreeSet {
	public static void main(String[] args) {
		//�ַ����������bug  set���� �Ѿ����ڲ��Ƚ���    �Ƚ��ַ����� 
	//�ⲿ�Ƚ���	
		TreeSet<Person> set = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o2.getAge()-o1.getAge();
			}
		});
		set.add(new Person("sdf",18));
		set.add(new Person("ls",39));
		set.add(new Person("eeee",99));
		set.add(new Person("fff",28));
		System.out.println(set);
	}
}
