/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月12日下午2:54:30 ;
 */
public class Student {
	private String name;
	private int age;
	public void setAge(int age) throws MyException{
		if(age>1&&age<100) {
			this.age=age;
			
			
		}else {
			throw new MyException("出错了");
		}
	}
	
	void test() {
		try {
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
