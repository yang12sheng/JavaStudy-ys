/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *1.�쳣����  2��       1.try  {���ܷ����쳣�Ĵ���}catch����{�����쳣���д���}finally{�ͷ���Դ} ��ʽ���д���
 *                 2.�׳��쳣�� ���Գ����׳�     �����˹��ֶ��׳�  
 *                 �����׳� ����ʱ���쳣�� ֻ�����е�ʱ����ܷ��֣�
 *            
 *            �����׳�����ʱ�ڵ��쳣��Exception����Ҫ�ڷ����������ϸ��߸��� ������ܷ����쳣   �� ���Ҵ���ȥ
 *                    
 *   @date: 2021��8��12������11:31:59 ;
 */
public class Demo06 {
public static void main(String[] args) throws Exception {
	try {
		throw new Exception();
	} finally {
		// TODO Auto-generated catch block
		System.out.println("1212");
	}
}
}
