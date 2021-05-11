import java.util.*;

class Array1 {
	public static void main(String args[]) {
		int num[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Enter values to be inserted : "+ i+1);
			num[i] = sc.nextInt();
		}
		
	}
}