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
 *ArraylistǶ�� hashmap 
 *   @date: 2021��8��11������3:48:57 ;
 */
public class Demo07 {
	public static void main(String[] args) {
		List<Map> list =new ArrayList<Map>();
		Map<String,String> m1= new HashMap<String,String> ();
		m1.put("���", "С��");
		m1.put("����", "����");
		list.add(m1);
		Map<String,String> m2= new HashMap<String,String> ();
		m2.put("���", "С��Ů");
		m2.put("����", "����");
		list.add(m2);
		System.out.println(list);
	}
}
