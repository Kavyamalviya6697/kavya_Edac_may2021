import java.util.*;

class P1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n :");
		int n = sc.nextInt();
	
		for(int i=1;i<=5;i++) { //row
			
			for(int j=1;j<=i;j++) { //column
				
				System.out.print(j+" ");
			}
			System.out.println();
		} 
	}					
}
