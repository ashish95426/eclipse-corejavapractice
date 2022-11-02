/*
 * program:to print details of employee
 * @author:Ashish kumar sahu
 * @date:02/11/22
 */
package com.employee;

public class Employee {	
	//declaring variabels
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	float rate=5.0f;
	
	//method to enter deatils
	void enterEmployeeDetails(int id,String name,double sal,String dep) {
		employeeId=id;
		employeeName=name;
		salary=sal;
		department=dep;
	}
	//method for salary hike
    void salayHike() {
    	salary=salary+((rate/100)*salary);
    	
    	
    }//end method
    
    void salaryHike(float hikeRate) {
    	
    	salary=salary+((hikeRate/100)*salary);
    	
    }
    //start method pintDetails
    void printDetails() {
    	System.out.println("Employeeid:"+employeeId);
    	System.out.println("employeename"+employeeName);
    	System.out.println("salary:"+salary);
    	System.out.println("department:"+department);
    	
    	
    }//end method printDetails

}//end class
