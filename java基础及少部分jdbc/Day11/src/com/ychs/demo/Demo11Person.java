/**
 *  @version:
 */
package com.ychs.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��10������3:04:39 ;
 */
public class Demo11Person {
	public static void main(String[] args) {
		
		Set<Person> set =new HashSet<Person>();
		//set �����ŵĶ����ȱȽ�hashcode  ��� hashcode ��һ��  ֱ�ӷ���set ������ 
		//���hashcode  һ��  ���űȽ�equals ���equals��ͬ  ֻ���һ��
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		set.add(new Person(1,"zs"));
		
		Person p = new Person(2,"list");
		//���hashcode ��ͬ��Ϊͬһ����
		set.add(p);
		set.add(p);
		set.add(p);
		set.add(p);
		set.add(p);
		
		System.out.println(set);
	}
}
