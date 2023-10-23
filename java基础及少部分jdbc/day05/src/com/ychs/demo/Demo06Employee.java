/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月2日下午2:19:46 ;
 */
public class Demo06Employee {
	public static void main(String[] args) {
		Employee e = new  Employee();
		e.setEmpno(1313);
		e.setEname("fsff");
		e.setDeptno(10);
		e.setDept(new Dept("sales","china",10));
		
		System.out.println(e);
		System.out.println("================================");
		//构造方法赋值     set 赋值
		Dept d = new Dept("account","taiyuan",20);
		Employee[] employees = new Employee[2];
		employees[0]=e;
		Employee e2 = new  Employee();
		e.setEmpno(66666);
		e.setEname("ggggg");
		e.setDeptno(20);
		e.setDept(new Dept("sales","china",10));
		
		employees[1]=e2;
		
		d.setEmployees(employees);
		System.out.println(d);
	}
}
