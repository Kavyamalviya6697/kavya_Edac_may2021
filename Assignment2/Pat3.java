import java.util.*;

class Pat3 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
		
			for(int j=1; j<=n-i; j++) {
			
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}