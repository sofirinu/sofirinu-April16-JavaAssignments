package javaAssignments;

public class MultiplicationTable {


	// Method to display the multiplication table

	public void Multiplication(int number)
	{
		System.out.println("    Multiplication Table of "+number+" - For Loop");
		System.out.println("=====================================================");

		// 1. Using for loop

		for(int i=0;i<=10;i++)
		{
			int rslt = i*number;
			System.out.println(number+" x "+i+" = "+rslt);
		}
		System.out.println("");
		System.out.println("    Multiplication Table of "+number+" - While Loop");
		System.out.println("=====================================================");


		// 2. Using while loop

		int i=0;
		while(i<=10)
		{
			int rslt = i*number;
			System.out.println(number+" x "+i+" = "+rslt);
			i++;
		}
	}


}
