/**
 *  @version:
 */
package com.ychs.demo;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日上午10:06:40 ;
 */
public class Demo02List {
	public static void main(String[] args) {
	List list = new ArrayList();
		//有序不是排序  是怎么存放进去怎么取出来 ） 能存放重复数据
		list.add(4);
		list.add(11);
		list.add(5);
		list.add(6);
		list.add(3);
		System.out.println(list);
		System.out.println(list.get(3));
		for(int i=0;i<list.size();i++) {
			list.set(i, (int)list.get(i)+1);
		}
		System.out.println(list);
		
	}
}
