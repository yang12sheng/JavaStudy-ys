/**
 *  @version:
 */
package com.ychs.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日下午3:04:39 ;
 */
public class Demo11Person {
	public static void main(String[] args) {
		
		Set<Person> set =new HashSet<Person>();
		//set 里面存放的对象先比较hashcode  如果 hashcode 不一样  直接放入set 集合里 
		//如果hashcode  一样  接着比较equals 如果equals相同  只存放一个
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		
		Person p = new Person(2,"list");
		//如果hashcode 相同作为同一个人
		set.add(p);
		set.add(p);
		set.add(p);
		set.add(p);
		set.add(p);
		
		System.out.println(set);
	}
}
