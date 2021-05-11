/* Write a Java program to compute the specified expressions and print the output. 
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889 */

import java.util.*;

class Expression {
	public static void main(String[] args) {
		double num_1 = (25.5 * 3.5 - 3.5 * 3.5);
		double num_2 = (40.5 - 4.5);
		
		double result = num_1/num_2;
		
		System.out.println("Num 1 = 25.5 * 3.5 - 3.5 * 3.5");
		System.out.println("Num 2 = 0.5 - 4.5");
		System.out.println("\nResult is : " + result);
	}
}
