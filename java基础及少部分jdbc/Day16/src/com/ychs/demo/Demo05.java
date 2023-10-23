/**
 *  @version:
 */
package com.ychs.demo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



/**
 * @author Ysheng
 *
 *   @date: 2021年8月17日上午11:16:16 ;
 */
public class Demo05 {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
		
		Class c = ArrayList.class;
		Constructor con = c.getConstructor(null);
		Object obj = con.newInstance(null);
		Method m = c.getMethod("add", Object.class);
		m.invoke(obj, "aaaa");//obj.m("aaaa")   m.invoke(obj,鍙傛暟);
		m.invoke(obj, true);
		m.invoke(obj, 1);
		System.out.println(obj);
		
	
		
		//list.add("aaa");
	
//	List<Integer> list =new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		Class c = list.getClass();
//		Method m = c.getMethod("add", Object.class);
//		m.invoke(list, "aaa");
//		m.invoke(list, true);
//		m.invoke(list,3.14);
//		
//		System.out.println(list);
	}
}
