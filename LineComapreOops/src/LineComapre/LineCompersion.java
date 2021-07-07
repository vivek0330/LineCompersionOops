package LineComapre;

import java.util.*;

public class LineCompersion {

	// Create a method to find the length of line through taking coordinates from user's
	public int myMethod() {

		Scanner myObj = new Scanner(System.in);
		System.out.println(" Welcome to Line Compersion Computation ");
		System.out.println("Enter x1, y1, x2, y2:  ");
		int coordinate_x1 = myObj.nextInt();
		int coordinate_y1 = myObj.nextInt();
		int coordinate_x2 = myObj.nextInt();
		int coordinate_y2 = myObj.nextInt();
		System.out.println("enter coordinate_x1: " + coordinate_x1);
		System.out.println("enter coordinate_y1: " + coordinate_y1);
		System.out.println("enter coordinate_x2: " + coordinate_x2);
		System.out.println("enter coordinate_y2: " + coordinate_y2);
		int Length = (int) (Math.sqrt((coordinate_x2 - coordinate_x1) ^ 2 + (coordinate_y2 - coordinate_y1) ^ 2));
		System.out.println("Length of a line: " + Length);
		return Length;
	}
	
	public void Equality() {
		int Line_1 = myMethod();
		System.out.println("Enter the Co-ordinates for second line");
		int Line_2 = myMethod();
		
		if (Line_1 == Line_2) {
			System.out.println("Both lines are equal");
		} else if (Line_1 > Line_2) {
			System.out.println("Line 1 is greater then Line 2");
		} else {
			System.out.println("Line 2 is greater then line 1");
		}
	}

	public static void main(String[] args) {
		LineCompersion sc = new LineCompersion();
		sc.Equality();
	}
}
