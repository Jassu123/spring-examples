/**
 * 
 */
package com.orm.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author siva
 *
 */
@Entity


public class Employee {
	@Id
	private int empNO;

	/**
	 * @return the empNO
	 */
	public int getEmpNO() {
		return empNO;
	}

	/**
	 * @param empNO the empNO to set
	 */
	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return the sal
	 */
	public Double getSal() {
		return sal;
	}

	/**
	 * @param sal the sal to set
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}

	/**
	 * @return the deptNo
	 */
	public Integer getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Column(name = "empname")
	private String ename;

	/**
	 * @param empNO
	 * @param ename
	 * @param sal
	 * @param deptNo
	 */
	public Employee(int empNO, String ename, Double sal, Integer deptNo) {
		super();
		this.empNO = empNO;
		this.ename = ename;
		this.sal = sal;
		this.deptNo = deptNo;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [empNO=" + empNO + ", ename=" + ename + ", sal=" + sal + ", deptNo=" + deptNo + "]";
	}

	@Column(name = "salary")
	private Double sal;
	@Column(name = "empdeptno")
	private Integer deptNo;

}
