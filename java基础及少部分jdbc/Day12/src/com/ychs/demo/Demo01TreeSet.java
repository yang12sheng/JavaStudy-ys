/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午9:24:48 ;
 */
public class Demo01TreeSet {
	public static void main(String[] args) {
		//字符串不会出现bug  set里面 已经有内部比较器    比较字符串了 
	//外部比较器	
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
