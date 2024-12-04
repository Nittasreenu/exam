package com.codinghub;

public class EMPLOYEE 
{
	int eid;
	String ename;
	String edept;
	double salary;
	public EMPLOYEE(int eid, String ename, String edept, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EMPLOYEE [eid=" + eid + ", ename=" + ename + ", edept=" + edept + ", salary=" + salary + "]";
	}
	
}
