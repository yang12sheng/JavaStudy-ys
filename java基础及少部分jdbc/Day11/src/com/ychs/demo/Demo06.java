/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��10������2:09:47 ;
 */
public class Demo06 {
	public static void main(String[] args) {
		
		List<String> list  = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("ccc");
		list.add("ddd");
		list.add("cccc");
		list.add("ccc");
		
		//�����ְ취
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		//�ڶ��ְ취
//		List<String> list2=new ArrayList<String>();
//		for(int i=0;i<list.size();i++) {
//			if(!list2.contains(list.get(i))) {
//				list2.add(list.get(i));
//			}
//		}
//		System.out.println(list2);
		
		//��һ�ְ취
//		for(int i =0;i<list.size();i++) {
//			for(int j=list.size()-1;j>1;j--) {
//				if(list.get(i).equals(list.get(j))) {
//					list.remove(j);
//				}
//			}
//		}System.out.println(list);
		
	}
}
