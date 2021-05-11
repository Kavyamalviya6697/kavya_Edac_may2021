/* Write a Java program to print the sum of two numbers.
Test Data: 74 + 36 */

import java.util.*;

class Sum	{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Input a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Input b : ");
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println("Sum is : " + c);
		
	}
}