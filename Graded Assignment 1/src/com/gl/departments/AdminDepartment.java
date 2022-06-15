package com.gl.departments;
/*
 * AdminDepartment will be a subclass of SuperDepartment
 * AdminDepartment will override below methods
 *             i)  departmentName 
              ii)  getTodaysWork  
             iii)  getWorkDeadline

 * 
 * */
public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return("Admin Department ");
	}
	public String getTodaysWork() {
		return("Complete your documents Submission");
	}
	public String getWorkDeadline() {
		return("Complete by EOD ");
	}

}
