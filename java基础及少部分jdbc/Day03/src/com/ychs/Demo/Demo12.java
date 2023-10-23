/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 ** 解决斐波那契数列前40项元素问题
	 * 在数学上有一个斐波那契数列：0，1，1，2，3，5，8，13，21，..
	 * 从第三项起，等于前两项之和； 求输出前40项；
 *   @date: 2021年7月29日下午3:29:23 ;
 */
public class Demo12 {
		public static void main(String[] args) {
			int f0 = 0;
			int f1 = 1;
			int times = (40-2)/2;
			System.out.print(f0+","+f1);
		    for(int i = 0;i < times;i++) {
		    	f0 = f0 + f1;    // 1
		    	f1 = f0 + f1;    // 1+1
		    	System.out.print(","+f0+","+f1);
		    	if(i%10==0) {
		    		System.out.println();
		    	}
		    }

		}

	}


