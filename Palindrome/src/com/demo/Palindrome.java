/*
 * program: to check a number is pallindrome or not
 * @author:Ashish kumar sahu
 * @date:01/11/22
 */
//declaring a package
package com.demo;

//import pakage
import java.util.Scanner;

//declaring a class
public class Palindrome {
	
	//method to check number is pallindrome or not
	public static void checkPalindrome(int number) {
		
		//declaring variabels
		int remainder=0;
		int reversenumber=0;//to store reverse number
		int temp=number;//to store the original number
		
		//to find reverse of nuber
		while(number>0) {
			remainder=number%10;
			reversenumber=(reversenumber*10)+remainder;
			number=number/10;
		}// end of while loop
		
		//checking number is pallindrome or not
		if(reversenumber==temp)
			System.out.println(temp+" is a pallindrome number");
		else
			System.out.println(temp+" is  not a pallindrome number");
	}//end of method
	

	//start main
	public static void main(String[] args) {
		
		//creating ascanner object
		Scanner sc=new Scanner(System.in);
		
		//declaring variabels
		int originalNumber=0;
		
		//taking input
		System.out.println("enter a number");
		originalNumber=sc.nextInt();
		
		//calling method to check pallindrome
		checkPalindrome(originalNumber);
        
		sc.close();//close scanner object
	}//end main 

}//end class
