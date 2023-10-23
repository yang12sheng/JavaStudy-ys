/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ysheng
 *Arraylist嵌套 hashmap 
 *   @date: 2021年8月11日下午3:48:57 ;
 */
public class Demo07 {
	public static void main(String[] args) {
		List<Map> list =new ArrayList<Map>();
		Map<String,String> m1= new HashMap<String,String> ();
		m1.put("周瑜", "小乔");
		m1.put("吕布", "貂蝉");
		list.add(m1);
		Map<String,String> m2= new HashMap<String,String> ();
		m2.put("杨过", "小龙女");
		m2.put("郭靖", "黄蓉");
		list.add(m2);
		System.out.println(list);
	}
}
