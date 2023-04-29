package javaAssignments;

import javaAssignments.Person;


// Creating class Person

public class Person {

	// Declaring the attributes

	String firstName;
	String lastName;
	int age;
	String countryofResidence; 
	String employmenStatus;

	// Constructor 

	Person(String firstName, String lastName, int age, String employmenStatus)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.employmenStatus = employmenStatus;
		countryofResidence = "Canada";
	}

	// Method to print the person's info

	public void PersonInfo()
	{

		System.out.println("Person Info:");
		System.out.println("======================================");
        System.out.println("Person name is - "+firstName+" "+lastName);
		System.out.println(firstName+"'s age is - " +age);
		System.out.println(firstName+" resides in - "+countryofResidence);
		System.out.println(firstName+" is working "+employmenStatus+" at ABC company");

	}


}
