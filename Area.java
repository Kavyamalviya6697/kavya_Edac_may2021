/* Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

import java.util.*;

class Circle {
	public static void main(String []args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		int r = sc.nextInt();
	
		double area = 3.14 * r * r;
		double circum = 2 * 3.14 *r;
	
		System.out.println("Area = "+ area);
		System.out.println("Circum = "+ circum);
	}
}