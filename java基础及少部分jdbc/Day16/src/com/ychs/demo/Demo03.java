/**
 *  @version:
 */
package com.ychs.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ysheng
 *获取构造方法
 *   @date: 2021年8月17日上午9:51:55 ;
 */
public class Demo03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Class c =	Class.forName("com.ychs.demo.Person");
	//获取构造方法
	  Constructor con1 =  c.getConstructor(null);
	  System.out.println(con1);
	  Constructor con2 = c.getConstructor(int.class,String.class);	
	  System.out.println(con2);
	  //获取所有的构造方法
	  Constructor[] cons = c.getDeclaredConstructors();
	  for(Constructor con:cons) {
		  System.out.println(con);
	  }
	  //通过构造方法创建对象
	  Person obj=(Person)con1.newInstance(null);
	  System.out.println(obj);
	  
	  con2.setAccessible(true);//暴力访问，取消检查
	  
	  Person obj2=(Person) con2.newInstance(1,"zfkk");
	  System.out.println(obj2);
	}
}
