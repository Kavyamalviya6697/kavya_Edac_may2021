/* Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16 */

import java.util.*;

class Div {
	public static void main(String args[]) {
		int divisor=0, divident=0, quotient=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nume : ");
		divisor = sc.nextInt();
		
		System.out.print("Enter deno : ");
		divident = sc.nextInt();
		
		quotient = divisor/divident;
		
		System.out.println("Result is : " + quotient);
	}
}