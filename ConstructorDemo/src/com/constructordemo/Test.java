/*
/ * program:to check demo of constructor
 * @author:Ashish kumar sahu
 * @date:02/11/22
 */
//declaring package
package com.constructordemo;

//declaring class
public class Test {

	//start main
	public static void main(String[] args) {
		//creating object 
		Constuctor s1=new Constuctor(102,"Ashish",89.0f);
		Constuctor s2=new Constuctor(103,"rohit",85.0f);
		Constuctor s3=new Constuctor(104,"Levis");
		
		Constuctor s4=new Constuctor();
		//printing 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("Student name:" + s4.getStName());

	}

}
