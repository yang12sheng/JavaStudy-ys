/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *��Ա��
 *   @date: 2021��8��2������2:14:43 ;
 */
public class Employee {
    private int empno;
    private String ename;
    //......
    private int deptno;
    
    private Dept dept;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", deptno=" + deptno + ", dept=" + dept + "]";
	}


    
    
    
    
}
