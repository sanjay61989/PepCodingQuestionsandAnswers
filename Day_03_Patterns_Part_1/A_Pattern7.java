package Day_03_Patterns_Part_1;

import java.util.*;

public class A_Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
/*
Sample Input
5

Sample Output
*	
	*		
		*			
			*				
				*
*/