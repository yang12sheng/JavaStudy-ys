/**
 *  @version:
 */
package com.ychs.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * @author Ysheng
 *
 *   @date: 2021��8��17������10:14:14 ;
 */
public class Demo04 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class c =	Class.forName("com.ychs.demo.Person");
	
		//��ȡ���췽��
		  Constructor con =  c.getConstructor(null);
		//��������
		  Object obj = con.newInstance(null);
		//ͨ��������ȡ����
		// Field nameField =  c.getField("name");
		// System.out.println(nameField);
		 Field ageField =  c.getDeclaredField("age");  //�ܻ�ȡ��������
		 System.out.println(ageField);
		Field[] fields= c.getDeclaredFields();
		 for(Field field:fields) {
			  System.out.println(field);
		  }
		 //�����Ը�ֵ  ��������������ĳ������
		// nameField.set(obj, "sd");
	//	 System.out.println(nameField.get(obj));
		 ageField.setAccessible(true);
		 ageField.set(obj, 12);
		 System.out.println(ageField.get(obj));
		 //��ȡ����
		 Method m1 = c.getMethod("toString", null);
		 System.out.println(m1);
		 Method m2 = c.getMethod("setAge", int.class);
		 System.out.println(m2);
		 Method m3 = c.getDeclaredMethod("f1",null);
		 System.out.println(m3);
		 System.out.println(m2.getName());
		 System.out.println(m2.getReturnType());
		 
		 //��ȡ���еķ���
		 Method[] Methods= c.getDeclaredMethods();
		 for(Method Method:Methods) {
			  System.out.println(Method);
		  }
		 //���÷���
		 Object res = m1.invoke(obj, null);
		 System.out.println(res);
		m3.setAccessible(true);
		 m3.invoke(obj, null);
	}
}

