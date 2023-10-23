/**
 *  @version:
 */
package com.ychs.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午9:47:48 ;
 */
public class Demo02HashMap {
	public static void main(String[] args) {
		Map<String,String>   map = new HashMap();
		map.put("1", "星期一");
		map.put("2", "星期二");
		map.put("3", "星期三");
		map.put("4", "星期四");
		map.put("5", "星期五");
		map.put("6", "星期六");
		map.put("7", "星期日");  // key 不能重复
		map.put("7", "星期7"); //覆盖上面星期日
		System.out.println(map);
		
	}
}





