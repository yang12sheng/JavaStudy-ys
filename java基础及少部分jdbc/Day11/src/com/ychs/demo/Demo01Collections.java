/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ysheng
 *对集合操作的工具类  服务于 collection 框架
 *   @date: 2021年8月10日上午9:42:34 ;
 */
public class Demo01Collections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();    //数组初始化有大小
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);
		
		Collections.sort(list);	System.out.println(list);
		
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println(list);
		
		Collections.shuffle(list);System.out.println(list);  //乱序
		
		int res = Collections.binarySearch(list, 4);System.out.println(res);
		
		
	}
}
