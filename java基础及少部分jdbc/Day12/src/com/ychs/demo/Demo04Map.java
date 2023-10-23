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
 *   @date: 2021��8��11������10:15:20 ;
 */
public class Demo04Map {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1","aaa");
		map.put("2","sss");
		map.put("3","ddd");
		map.put("4","fff");
		map.put("5","ggg");
		//map���ϵı���  �� mapת����set���б���
		//1. 
		Set<String> keySet = map.keySet();    //map ������ key �ļ���         ctrl 2  + l
		//��ͨforѭ���ܱ���set�𣿲���  
		for(String key:keySet) {         //��ǿ��forѭ��
			System.out.println(key+","+map.get(key));
		}
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+",,,"+map.get(key));
		}
		System.out.println("===================================");
		Collection<String> values = map.values();    //�ظ���Ҳ����� 
		for(String s:values) {
			System.out.println(s);
		}
		//�ڶ��ַ�ʽ����
		System.out.println("====================================");
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> entry:entrySet) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		//������ 
		System.out.println("========================");
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Entry<String, String> next = iterator2.next();
			System.out.println(next.getKey()+next.getValue());
		}
	}
}
