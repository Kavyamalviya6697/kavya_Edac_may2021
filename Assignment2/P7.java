import java.util.*;

class P7 {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)	{
			for(int j=i; j<=n-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}
}