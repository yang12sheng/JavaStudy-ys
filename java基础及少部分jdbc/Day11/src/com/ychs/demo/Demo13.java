/**
 *  @version:
 */
package com.ychs.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月10日下午3:41:02 ;
 */
public class Demo13 {
	public static void main(String[] args) {
		List<Student03> stus = new ArrayList<Student03>();
		stus.add(new Student03("121","zss",12));
		stus.add(new Student03("123","zzsfzf",9));
		stus.add(new Student03("124","zfFsfs",19));
		stus.add(new Student03("122","zjdyh",5));
		
		Collections.sort(stus,new Comparator<Student03>() {
	@Override
	public int compare (Student03 o1,Student03 o2 ) {
		return o2.getAge()-o1.getAge();
	}
		});
		
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.sort(list1);
		List<String> list2 = new ArrayList<String>();
		Collections.sort(list2);
	}
}
