/**
 *  @version:
 */
package com.ychs.demo;

import java.util.HashSet;
import java.util.Random;

/**
 * @author Ysheng
 *获取10ge   1-20 随机数   随机数不能重复
 *   @date: 2021年8月10日下午4:14:12 ;
 */
public class Demo14 {
	public static void main(String[] args) {
		Random random = new Random();
		HashSet set = new HashSet<Integer>();
		while(true) {
			set.add(random.nextInt(20)+1);
			if(set.size()==10) {
				break;
			}
		}
//		for(int i=0;i<10;i++) {
//			set.add(random.nextInt(20)+1);
//		}
		System.out.println(set);
		
	}
}
