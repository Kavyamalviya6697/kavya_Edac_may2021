/* Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */

import java.util.*;

class Prod {
	public static void main(String args[])	{
		int a=0, b=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num 1 : ");
		a = sc.nextInt();
		
		System.out.print("Enter num 2 : ");
		b = sc.nextInt();
		
		int p = a * b;
		
		System.out.println("Product is : " + p);
	}
}