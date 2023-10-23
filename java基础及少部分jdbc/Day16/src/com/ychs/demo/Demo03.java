/**
 *  @version:
 */
package com.ychs.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ysheng
 *��ȡ���췽��
 *   @date: 2021��8��17������9:51:55 ;
 */
public class Demo03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Class c =	Class.forName("com.ychs.demo.Person");
	//��ȡ���췽��
	  Constructor con1 =  c.getConstructor(null);
	  System.out.println(con1);
	  Constructor con2 = c.getConstructor(int.class,String.class);	
	  System.out.println(con2);
	  //��ȡ���еĹ��췽��
	  Constructor[] cons = c.getDeclaredConstructors();
	  for(Constructor con:cons) {
		  System.out.println(con);
	  }
	  //ͨ�����췽����������
	  Person obj=(Person)con1.newInstance(null);
	  System.out.println(obj);
	  
	  con2.setAccessible(true);//�������ʣ�ȡ�����
	  
	  Person obj2=(Person) con2.newInstance(1,"zfkk");
	  System.out.println(obj2);
	}
}
