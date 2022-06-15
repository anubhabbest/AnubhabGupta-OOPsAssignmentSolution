package com.gl.departments;
/*
 * SuperDepartment is an abstract class as in any company there cannot be a department named SuperDepartment 
 * and hence it's object should not be allowed.
 * 
 * SuperDepartment will be inherited by all other departments.
 * 
 * It has the below 4 methods
 *			   i)  departmentName 
              ii)  getTodaysWork  
             iii)  getWorkDeadline
              iv)  isTodayAHoliday

 * 
 * */
public abstract class SuperDepartment {
	public String departmentName() {
		return("Super Department");
	}
	public String getTodaysWork() {
		return("No Work as of now");
	}
	public String getWorkDeadline() {
		return("Nil");
	}
	public String isTodayAHoliday() {
		return("Today is not a holiday");
	}
}
