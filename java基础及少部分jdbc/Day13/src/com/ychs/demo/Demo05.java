/**
 *  @version:
 */
package com.ychs.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Ysheng
 *�����쳣�Ĵ���  һ�� try catch  ���в�����   �ڶ���  ���쳣�ӳ�ȥ���������ߴ���
 *throw��  �ֶ��׳�һ���쳣  ������������
 *throws������һ���쳣   ���ڷ�����������       �����߸��� �ҵķ����ڲ����ܷ������쳣
 *   @date: 2021��8��12������10:41:15 ;
 */
public class Demo05 {
	public static void main(String[] args) {
		
		try {
			SimpleDateFormat sf= new SimpleDateFormat("ffff");
			sf.parse("aaaa");
			Class.forName("com.ychs.demo.demo11");
//			System.exit(0);
			int i =1/0;  //����ʱ���쳣  �����ﲻ�ù�
		} catch (ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();          //��ӡ��ջ����Ϣ  ��ӡ�쳣����ϸ��Ϣ
			throw new Exception(e);                //�ֶ��׳�һ���쳣
			throw new RuntimeException(e); //�׳�����ʱ���쳣
		}
		
//		try {
//			int[] arr = null;
//			System.out.println(arr[0]);
//			int i=1/0;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
