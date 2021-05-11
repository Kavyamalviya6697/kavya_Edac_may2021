/* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 */

import java.util.*;

class Oper {
	public static void main(String args[]) {
		int num1=0, num2=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num 1 : ");
		num1 = sc.nextInt();
	
		System.out.print("Enter num 1 : ");
		num2 = sc.nextInt();
	
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
	
		System.out.println("\nAddition = " + add);
		System.out.println("Subtraction = " + sub);
		System.out.println("Multiplication = " + mul);
		System.out.println("Division = " + div);
		System.out.println("Modulos = " + mod);
	}
}