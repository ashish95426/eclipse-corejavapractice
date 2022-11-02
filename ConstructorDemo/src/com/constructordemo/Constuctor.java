/*
 * program:to check demo of constructor
 * @author:Ashish kumar sahu
 * @date:02/11/22
 */
//declaring package
package com.constructordemo;

//declaring class
public class Constuctor {
	
	//declaing variabels
	private int id;
	private String stName;
	private float marks;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	/**
	 * @param id
	 * @param stName
	 * @param marks
	 */
	//parametrised constructutor
	public Constuctor(int id, String stName, float marks) {
		super();
		this.id = id;
		this.stName = stName;
		this.marks = marks;
	}

	/**
	 * @param id
	 * @param stName
	 */
	//parametrised constructor
	public Constuctor(int id, String stName) {
		super();
		this.id = id;
		this.stName = stName;
	}

	@Override
	public String toString() {
		return "Syudent id=" + id + ", student Name=" + stName + ",student marks=" + marks + "]";
	}

	/**
	 * 
	 */
	//default constructor
	public Constuctor() {
		super();
		System.out.println("default....");
		
	}
	

}
