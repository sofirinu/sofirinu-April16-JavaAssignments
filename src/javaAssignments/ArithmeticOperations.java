package javaAssignments;

public class ArithmeticOperations {

	float num1;
	float num2;
	float num3;
	float num4;

	// Method with return type int to print sum of 2 integers

	public float Sum(float num1, float num2)
	{
		float sum = num1 + num2;
		return sum;
	}


	// Method to print difference between 2 integers

	public void Difference(float num1, float num2)
	{
		float diff = num1 - num2;
		System.out.println("Difference between "+num1+" and "+num2+": "+diff);

	}


	// Method to print product of 2 integers


	public void Product(float num1, float num2)
	{
		float product = num1 * num2;
		System.out.println("Product of "+num1+" and " +num2+": "+product);

	}


	// Method to print average of 2 integers

	public void Average(float num3, float num4)
	{
		float avg = (num3 + num4) / 2;

		// Formatting average value to 2 decimal points

		String avgDouble = String.format("%.2f", avg);
		
		System.out.println("Average of "+num1+" and "+num2+":"+avgDouble);


	}


	// Static method to print largest among 2 integers

	public static void Maximum(float num1, float num2)
	{
		if(num1>num2)
			System.out.println("Larger number is: "+num1);
		else
			System.out.println("Larger number is: "+num2);
	}


	// Method to print smallest among 2 integers

	public void Minimum(float num1, float num2)
	{
		if(num1<num2)
			System.out.println("Smaller number is: "+num1);
		else
			System.out.println("Smaller number is: "+num2);
	}

}
