import java.util.*;

class PalindromeExample	{  

	public static void main(String args[]){  
		int rem,sum=0,temp; 

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : "); //It is the number variable to be checked for palindrome
		int n = sc.nextInt();
				
		temp = n;    
		
		while(n>0)	{  
		
			rem=n%10;  //getting remainder  
			sum=(sum*10)+rem;    
			n=n/10; 
			
		}  
		
		if(temp==sum)    
			System.out.println("It is a Palindrome. ");    
		
		else    
			System.out.println("Not a Palindrome.");    
	}  
}

