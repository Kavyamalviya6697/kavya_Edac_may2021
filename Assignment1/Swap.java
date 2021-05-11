/* Write a Java program to swap two variables.*/

import java.util.*;

class Swap {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entry of a : ");
		int a = sc.nextInt();
		
		System.out.print("Entry of b : ");
		int b = sc.nextInt();
		
		int swap = a;
		a = b;
		b = swap;
		
		System.out.println("After swapping values are \na = "+a+"\nb = "+ b);
			
	}
}



