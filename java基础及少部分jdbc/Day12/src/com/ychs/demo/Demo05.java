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
 *   @date: 2021��8��11������11:20:40 ;
 */
public class Demo05 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("���μ�","����������");
		map.put("��������","�����ŷ�");
			Set<String> keySet = map.keySet();     //map ������ key �ļ���         ctrl 2  + l
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+",,,"+map.get(key));
		}
//		
	
//		//��ͨforѭ���ܱ���set�𣿲���  
//		for(String key:keySet) {         //��ǿ��forѭ��
//			System.out.println(key+","+map.get(key));
//		}
	}
}
