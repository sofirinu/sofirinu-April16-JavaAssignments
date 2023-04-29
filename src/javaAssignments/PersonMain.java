package javaAssignments;

public class PersonMain {

	public static void main(String[] args) {


		System.out.println("        Question 1 - OUTPUT     ");
		System.out.println("*****************************************");


		// Creating 2 instances & Setting the attributes

		Person p1 = new Person("John", "Doe", 35, "Full time") ;
		
		Person p2 = new Person("David", "Mark", 28, "Part time"); 
		
		// Calling the methods
		
		p1.PersonInfo();
				
		System.out.println();
		
		p2.PersonInfo();



	}

}
