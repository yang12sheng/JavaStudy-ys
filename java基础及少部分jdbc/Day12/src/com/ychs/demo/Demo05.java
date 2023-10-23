/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午11:20:40 ;
 */
public class Demo05 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("西游记","吕布，貂蝉");
		map.put("三国演义","关羽，张飞");
			Set<String> keySet = map.keySet();     //map 集合里 key 的集合         ctrl 2  + l
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+",,,"+map.get(key));
		}
//		
	
//		//普通for循环能遍历set吗？不能  
//		for(String key:keySet) {         //增强型for循环
//			System.out.println(key+","+map.get(key));
//		}
	}
}
