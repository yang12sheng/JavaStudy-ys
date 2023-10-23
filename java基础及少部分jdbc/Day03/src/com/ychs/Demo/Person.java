/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年7月29日下午4:09:31 ;
 */
public class Person {
	int age;
	@Override         // 重写object 类          alt /
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.age==p.age;   // this 表示当前对象
	}
}
