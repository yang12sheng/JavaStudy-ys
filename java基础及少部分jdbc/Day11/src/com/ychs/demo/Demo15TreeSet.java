/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日下午4:22:20 ;
 */
public class Demo15TreeSet {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(
				new Comparator<String>() {
				@Override
				public int compare(String o1,String o2)
				{		return o2.compareTo(o1);}
				});
		set.add("aaa");
		set.add("ddd");
		set.add("bbb");
	//	set.add(1);
	//	set.add(3.14);
		set.add("eee");
		set.add("de");
		//set.clear(); //清空
System.out.println(set);		
	}
}
