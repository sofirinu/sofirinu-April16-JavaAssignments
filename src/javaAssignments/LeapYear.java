package javaAssignments;

public class LeapYear {

	int year;

	// Non-static method to print whether the year is a leap year or not

	public void CheckLeapYear(int year)
	{
		if(year % 4 ==0 )
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}

}
