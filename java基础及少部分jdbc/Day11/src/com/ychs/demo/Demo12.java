/**
 *  @version:
 */
package com.ychs.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Ysheng
 *linkedhashset
 *   @date: 2021年8月10日下午3:17:58 ;
 */
public class Demo12 {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("aaa");
		set.add("vvv");
		set.add("1");
		System.out.println(set);
		
	for(Object obj: set) {
		System.out.println(obj);
	}
	
	
	//迭代器
	for(Iterator iterator = set.iterator();iterator.hasNext();) {
		System.out.println(iterator.next());
	}
	//       ||
	Iterator iterator =set.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	
	
		//集合集合相互转换    addall      构造方法
		List list = new ArrayList();
				list.addAll(set);
				System.out.println(list);
				 
				
		List list2 = new ArrayList(set);	System.out.println(list2);

	}
}
