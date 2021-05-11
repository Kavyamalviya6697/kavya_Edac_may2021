import java.util.*;

class Pat5 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>=0; j--)	{
				System.out.print(" ");
			}
			
			for(int k=1; k>=n; k++)	{
				System.out.print("*");
			}
			
			for(int k=0; k>=n; k++)	{
				System.out.print("*");
			}
		}
	}
}