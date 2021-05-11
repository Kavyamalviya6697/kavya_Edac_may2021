import java.util.*;

class Pat10 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
		
			for(int j=0; j<n-i; j++) {
			
				System.out.print(" ");
			}
			
			for(int k=1; k<=n; k++) {
			
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}