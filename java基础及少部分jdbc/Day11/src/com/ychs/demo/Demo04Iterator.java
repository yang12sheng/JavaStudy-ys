/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日上午10:41:27 ;
 */
public class Demo04Iterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("cc");
		list.add("ee");
		list.add("dd");
		list.add("ff");
		
		for(int i=0;i<list.size();i++)
		{
			if("cc".equals(list.get(i))) {
				list.add("kk");
			}
		}System.out.println(list);
		
		//foreach 遍历 增强型for循环
		for(String list1:list) {
			if("cc".equals(list.list1) {	list.add("kk");
		}
		
			System.out.println(list1);
		}
		
		//集合迭代器
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String s=  iterator.next();
			if("cc".equals(s)) {
				//list.add("kk");
				iterator.remove();
			}
			System.out.println(s);
		}System.out.println(list);
		
		ListIterator<String> li = list.listIterator();
		while(li.hasNext()) {
			String s = li.next();
			if("cc".equals(s)) {
				li.add("ff");
			}
			System.out.println(s);
		}System.out.println(list);
	}
}
