/**
 *  @version:
 */
package com.ychs.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��11������9:47:48 ;
 */
public class Demo02HashMap {
	public static void main(String[] args) {
		Map<String,String>   map = new HashMap();
		map.put("1", "����һ");
		map.put("2", "���ڶ�");
		map.put("3", "������");
		map.put("4", "������");
		map.put("5", "������");
		map.put("6", "������");
		map.put("7", "������");  // key �����ظ�
		map.put("7", "����7"); //��������������
		System.out.println(map);
		
	}
}





