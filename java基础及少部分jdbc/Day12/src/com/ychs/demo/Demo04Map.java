/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午10:15:20 ;
 */
public class Demo04Map {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1","aaa");
		map.put("2","sss");
		map.put("3","ddd");
		map.put("4","fff");
		map.put("5","ggg");
		//map集合的遍历  把 map转换成set进行遍历
		//1. 
		Set<String> keySet = map.keySet();    //map 集合里 key 的集合         ctrl 2  + l
		//普通for循环能遍历set吗？不能  
		for(String key:keySet) {         //增强型for循环
			System.out.println(key+","+map.get(key));
		}
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+",,,"+map.get(key));
		}
		System.out.println("===================================");
		Collection<String> values = map.values();    //重复的也能输出 
		for(String s:values) {
			System.out.println(s);
		}
		//第二种方式遍历
		System.out.println("====================================");
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> entry:entrySet) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		//迭代器 
		System.out.println("========================");
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Entry<String, String> next = iterator2.next();
			System.out.println(next.getKey()+next.getValue());
		}
	}
}
