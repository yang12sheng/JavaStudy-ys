/**
 *  @version:
 */
package com.ychs.demo;

import java.util.TreeMap;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��11������2:21:28 ;
 */
public class Demo05TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer,String > map = new TreeMap<Integer,String > ();
		//��key��������
		map.put(5, "aaa");
		map.put(4, "aaa");
		map.put(2, "aaa");
		map.put(1, "aaa");
		map.put(3, "aaa");
		System.out.println(map);
	}
}
