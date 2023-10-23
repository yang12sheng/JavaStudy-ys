/**
 *  @version:
 */
package com.ychs.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午10:01:44 ;
 */
public class Demo03Student {
	public static void main(String[] args) {
		Map<String,Student> map = new HashMap<String,Student>();
		map.put("1001",new Student("sz","aaa",18,90.3));
		map.put("1002",new Student("ad","ddd",18,50.3));
		map.put("1003",new Student("af","fff",18,80.3));
		map.put("1004",new Student("ag","ggg",18,70.3));
		map.put("1005",new Student("ah","sss",18,60.3));
		
		Student stu6 = new Student("1006","hhh",18,80.5);
		map.put(stu6.getSno(),stu6);
		
		//通过key 获取 value值   
		System.out.println(map.get("1004"));
		//是否包含某个key
		System.out.println(map.containsKey("1003"));
		System.out.println(map.containsValue(new Student("1006","hhh",18,80.5)));//false   haxi 地址不一样
		
		System.out.println(map.remove("1004"));
		System.out.println(map);
		map.clear();
		System.out.println(map.size());
	}
}



