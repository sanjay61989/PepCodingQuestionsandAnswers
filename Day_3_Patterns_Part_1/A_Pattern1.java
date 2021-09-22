package Day_3_Patterns_Part_1;

import java.util.Scanner;

public class A_Pattern1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
/*

I/P
5

O/P
*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*	

*/