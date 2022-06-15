package com.gl.departments;
/*
 * TechDepartment will be a subclass of SuperDepartment
 * TechDepartment will override below methods
 *             i)  departmentName 
              ii)  getTodaysWork  
             iii)  getWorkDeadline
	TechDepartment has a new method
	          iv) getTechStackInformation
 * 
 * */
public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return("Tech Department ");
	}
	public String getTodaysWork() {
		return("Complete coding of module 1");
	}
	public String getWorkDeadline() {
		return("Complete by EOD ");
	}
	public String getTechStackInformation() {
		return("core Java");
	}
}
