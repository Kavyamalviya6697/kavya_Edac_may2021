/* Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8 */


import java.util.Scanner;

public class Question_25 {

	public static void main(String[] args) {

	long octal_num, decimal_num = 0;
	int i = 0;
	
	Scanner in = new Scanner(System.in);
	System.out.print("Input any octal number: ");
	octal_num = in.nextLong();
	
	while (octal_num != 0) {
		decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
		octal_num = octal_num / 10;
	}
	
	System.out.print("Equivalent decimal number: " + decimal_num+"\n");
	
	}
}