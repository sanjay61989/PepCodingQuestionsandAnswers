package Day_4_Patterns_Part_2;

import java.util.*;

public class B_Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nosp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nosp; j++) {
				System.out.print("\t");
			}
			System.out.print("*");
			nosp--;
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