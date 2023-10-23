/**
 *  @version:
 */
package com.ychs.demo;

import java.util.LinkedList;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日下午2:35:00 ;
 */
public class Demo07Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); 
		list.add("aaa");
		list.add("bbb");
		list.addFirst("zzz");
		list.addLast("sds");
		System.out.println(list);
		
		list.remove("bbb");
		list.removeFirst();
		System.out.println(list);
	}
}
