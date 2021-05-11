/* Write a Java program that takes a number as input and prints its multiplication
table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

import java.util.*;

class Tables {
	public static void main(String args[]) {
		int i=0, j=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Required no. table : ");
		i = sc.nextInt();
		
		for(j=1;j<=10;j++)	{
			System.out.println(i+" * "+j+" = "+i*j);
		}		
	}
}
