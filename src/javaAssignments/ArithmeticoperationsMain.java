package javaAssignments;

public class ArithmeticoperationsMain {

	public static void main(String[] args) {
		
		System.out.println("        Question 4 - OUTPUT     ");
		System.out.println("*****************************************");

		ArithmeticOperations arith = new ArithmeticOperations();
		
		arith.num1 = 25;
		arith.num2 = 5;
		float sum = arith.Sum(25,5);
		System.out.println("Sum of "+arith.num1+" and "+arith.num2+": "+sum);
		arith.Difference(25, 5);
		arith.Product(25, 5);
		arith.Average(25, 5);
		ArithmeticOperations.Maximum(25, 5);
		arith.Minimum(25, 5);

	}

}
