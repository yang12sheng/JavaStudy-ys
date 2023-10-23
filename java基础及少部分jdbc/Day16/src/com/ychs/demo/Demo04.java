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
 *   @date: 2021年8月17日上午10:14:14 ;
 */
public class Demo04 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class c =	Class.forName("com.ychs.demo.Person");
	
		//获取构造方法
		  Constructor con =  c.getConstructor(null);
		//创建对象
		  Object obj = con.newInstance(null);
		//通过类对象获取属性
		// Field nameField =  c.getField("name");
		// System.out.println(nameField);
		 Field ageField =  c.getDeclaredField("age");  //能获取任意属性
		 System.out.println(ageField);
		Field[] fields= c.getDeclaredFields();
		 for(Field field:fields) {
			  System.out.println(field);
		  }
		 //给属性赋值  但是属性隶属于某个对象
		// nameField.set(obj, "sd");
	//	 System.out.println(nameField.get(obj));
		 ageField.setAccessible(true);
		 ageField.set(obj, 12);
		 System.out.println(ageField.get(obj));
		 //获取方法
		 Method m1 = c.getMethod("toString", null);
		 System.out.println(m1);
		 Method m2 = c.getMethod("setAge", int.class);
		 System.out.println(m2);
		 Method m3 = c.getDeclaredMethod("f1",null);
		 System.out.println(m3);
		 System.out.println(m2.getName());
		 System.out.println(m2.getReturnType());
		 
		 //获取所有的方法
		 Method[] Methods= c.getDeclaredMethods();
		 for(Method Method:Methods) {
			  System.out.println(Method);
		  }
		 //调用方法
		 Object res = m1.invoke(obj, null);
		 System.out.println(res);
		m3.setAccessible(true);
		 m3.invoke(obj, null);
	}
}

