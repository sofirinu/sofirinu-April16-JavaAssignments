package javaAssignments;

public class MarksGrades {


	// Method to check the mark and print the grades

	public void CheckGrades(int mark)
	{
		if(mark>90 && mark<=100)
		{
			System.out.println("Marks attained by student is "+mark );
			System.out.println("Grade attained is: A");
		}
		else if(mark<= 90 && mark>=80)
		{
			System.out.println("Marks attained by student is "+mark);
			System.out.println("Grade attained is: B");
		}
		else if(mark<= 79 && mark>=68)
		{
			System.out.println("Marks attained by student is "+mark);
			System.out.println("Grade attained is: C");
		}
		else if(mark<= 67 && mark>=55)
		{
			System.out.println("Marks attained by student is "+mark);
			System.out.println("Grade attained is: D");
		}
		else if(mark<= 54 && mark>=40)
		{
			System.out.println("Marks attained by student is "+mark);
			System.out.println("Grade attained is: E");
		}
		else if(mark<40 && mark>=0)
		{
			System.out.println("Marks attained by student is "+mark);
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Marks attained by student is "+mark);
			System.out.println("Invaid Mark");     
		}

		System.out.println();
	}
}


