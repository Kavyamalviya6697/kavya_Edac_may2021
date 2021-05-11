/*  Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.  */

import java.util.*;

class Avg {
	public static void main(String args[]) {
		
		Scanner abc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = abc.nextInt();
		
		System.out.print("Enter num2 : ");
		int num2 = abc.nextInt();
		
		System.out.print("Enter num3 : ");
		int num3 = abc.nextInt();
		
		int average = (num1 + num2 + num3) / 3;
		
		System.out.print("Average is : " + average);
	}
}