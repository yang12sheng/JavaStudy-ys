/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 ** ���쳲���������ǰ40��Ԫ������
	 * ����ѧ����һ��쳲��������У�0��1��1��2��3��5��8��13��21��..
	 * �ӵ������𣬵���ǰ����֮�ͣ� �����ǰ40�
 *   @date: 2021��7��29������3:29:23 ;
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


