import java.util.*;

class P16 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
		
			for(int j=n; j>n-i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}	
	}
}