package javaAssignments;



public class AreaPerimeter {

	int choice;

	// Switch statement to calculate the area and perimeter of a rectangle, square and circle

	public void SwitchStatement(int choice)
	{
		int length = 15;
		int breadth = 10;
		int side = 4;
		int radius = 3;
		float pi = 3.14f;
		switch(choice)
		{
		case 1:
			int rectarea = length*breadth;
			System.out.println("Choice:"+choice);
			System.out.println("Area of rectangle: "+rectarea);
			break;
		case 2:
			int rectperi = 2*(length+breadth);
			System.out.println("Choice:"+choice);
			System.out.println("Perimeter of rectangle: "+rectperi);
			break;
		case 3:
			int squarearea = side*side;
			System.out.println("Choice:"+choice);
			System.out.println("Area of square: "+squarearea);
			break;
		case 4:
			int squareperi = 4*side;
			System.out.println("Choice:"+choice);
			System.out.println("Perimeter of square: "+squareperi);
			break;
		case 5:
			float circarea = pi*radius*radius;
			System.out.println("Choice:"+choice);
			System.out.println("Area of circle: "+circarea);
			break;
		case 6:
			float circperi = 2*pi*radius;
			System.out.println("Choice:"+choice);
			System.out.println("Perimeter of circle: "+circperi);
			break;
		default:
			System.out.println("Choice:"+choice);
			System.out.println("Invalid Choice");
			
		}
		System.out.println();

	}
}









