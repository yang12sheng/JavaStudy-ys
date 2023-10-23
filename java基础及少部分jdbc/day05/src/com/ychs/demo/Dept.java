/**
 *  @version:
 */
package com.ychs.demo;

import java.util.Arrays;

/**
 * @author Ysheng
 * ����
 *   @date: 2021��8��2������2:11:45 ;
 */
public class Dept {
	
	private String dname;       //��������
	private String loc;        // ��ַ
	private int deptno;     //���ź�
	
	private Employee[] employees;
	
public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

public Dept(String dname, String loc, int deptno) {
	super();
	this.dname = dname;
	this.loc = loc;
	this.deptno = deptno;
}

public int getDeptno() {
	return deptno;
}

public void setDeptno(int deptno) {
	this.deptno = deptno;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}

@Override
public String toString() {
	return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", employees=" + Arrays.toString(employees)
			+ "]";
}


	
}
