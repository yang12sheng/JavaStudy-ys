/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ysheng
 *    ArrayList 转化为 linkedlist 
 *   @date: 2021年8月10日下午2:54:21 ;
 */
public class Demo09 {
	public static void main(String[] args) {
		
		ArrayList<String> list  = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("ccc");
		list.add("ddd");
		list.add("cccc");
		list.add("ccc");
	LinkedList<String> list2 = new LinkedList<String>(list);
	System.out.println(list2);
}}
