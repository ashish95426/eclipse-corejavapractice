/*
 * program:to print details of employee
 * @author:Ashish kumar sahu
 * @date:02/11/22
 */
//declaring package
package com.employee;

import java.util.Scanner;

//declaring class
public class EmployeeTest {

	//start main
	public static void main(String[] args) {
     
		//ceating constructor 
		Scanner sc=new Scanner(System.in);
      
      //taking input
      System.out.println("enter employee id");
      int eid=sc.nextInt();
      System.out.println("enter employee name");
      String ename=sc.next();
      System.out.println("enter employee Salary");
      double salary=sc.nextDouble();
      System.out.println("enter employee department");
      String  department=sc.next();
      
      //crating object of class
      Employee e1=new Employee();
        e1.enterEmployeeDetails(eid, ename, salary, department);
        e1.salayHike();
        System.out.println("--------------");
        e1.printDetails();
        Employee e2=new Employee();
        e2.enterEmployeeDetails(eid, ename, salary, department);
        e2.salaryHike(20);
        System.out.println("--------------");
        e2.printDetails();
	}//end main

}//end class
