/* Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

import java.util.*;

class Rect {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Width : ");
		double width = sc.nextDouble();
		
		System.out.print("Enter Height : ");
		double height = sc.nextDouble();
		
		double peri = 2 * (width + height);
		double area = width * height;
		
		System.out.println("Perimeter of rectangle : " + peri);
		System.out.println("Area of rectangle is : " + area);
	}
}

// String strDouble = String.format("%.2f", 2.00023); System.out.println(strDouble); // print 2.00

//String strDouble = String.format("%.2f", 2.00023); System.out.println(strDouble); // print 2.00
