/* Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13 */

import java.util.*;

class Test {
	public static void main(String []args) {
		int r1=0, r2=0, r3=0, r4=0;
		
		r1 = -5 + 8 * 6;
		r2 = (55+9) % 9;
		r3 = 20 + -3*5 / 8;
		r4 = 5 + 15 / 3 * 2 - 8 % 3;
		
		System.out.println("output1 : " + r1);
		System.out.println("output2 : " + r2);
		System.out.println("output3 : " + r3);
		System.out.println("output4 : " + r4);	
		
	}
}