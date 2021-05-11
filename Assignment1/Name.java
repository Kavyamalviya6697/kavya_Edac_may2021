/* Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov */

import java.util.*;

class Name {
	public static void main(String args[])	{
		String nm;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		nm = sc.nextLine();
		
		System.out.println("Hello !\n" + nm);
	}
}

