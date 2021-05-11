/* Write a Java program to convert a decimal number to octal number.
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17 */


import java.util.*;

public class Question_21 {

    public static void main(String args[])	{
    
        int dec_num, rem, quot, i=1, j;
        int oct_num[] = new int[100];
		
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();
        quot = dec_num;
		
        while(quot != 0)	{
        
            oct_num[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--)	{
        
            System.out.print(oct_num[j]);
        }
		System.out.print("\n");
    }
}
