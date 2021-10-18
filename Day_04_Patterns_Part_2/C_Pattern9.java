package Day_04_Patterns_Part_2;

import java.util.*;

public class C_Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nosp = n - 2;
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("*\t");
					for (int j2 = 1; j2 <= nosp; j2++) {
						System.out.print("\t");
					}
					if (i != n / 2 + 1)
						System.out.print("*\t");

				} else {
					System.out.print("\t");
				}
			}
			nosp = nosp - 2;
			System.out.println();
		}
		nosp = 1;
		int op = n / 2 - 1;
		int innerspace = 1;
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= op; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for (int j = 1; j <= innerspace; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			op--;
			innerspace = innerspace + 2;
			System.out.println();
		}
	}
}

/*
Sample Input
5
Sample Output
*						*
	*				*
		*		*
			*
		*		*
	*				*
*						*	
*/