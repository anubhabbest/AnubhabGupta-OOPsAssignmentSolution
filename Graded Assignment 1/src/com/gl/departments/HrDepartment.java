package com.gl.departments;
/*
 * HrDepartment will be a subclass of SuperDepartment
 * HrDepartment will override below methods
 *             i)  departmentName 
              ii)  getTodaysWork  
             iii)  getWorkDeadline
	HrDepartment has a new method
	          iv) doActivity
 * */
public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return("Hr Department ");
	}
	public String getTodaysWork() {
		return("Fill today's worksheet and mark your attendance");
	}
	public String getWorkDeadline() {
		return("Complete by EOD ");
	}
	public String doActivity() {
		return("team Lunch");
	}

}
