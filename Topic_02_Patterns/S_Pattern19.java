package Topic_02_Patterns;

import java.util.*;

public class S_Pattern19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1) {
					if (j <= (n / 2) + 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
				if (i > 1 && i <= n / 2) {
					if (j == n / 2 + 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
				if (i == n / 2 + 1) {
					System.out.print("*\t");
				}
				if (i > n / 2 + 1 && i < n) {
					if (j == 1 || j == n / 2 + 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
				if (i == n) {
					if (j == 1 || j >= n / 2 + 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
			}
			System.out.println();
		}
	}
}

/*
For n=7
*   *   *   *			*				//4
			*			*				//2
			*			*				//2
*	*	*	*	*	*	*				//7
*			*		     				//2
*			*						    //2
*			*   *   *   *				//4

for n=9
*	*	*	*	*				*               //5//3 
				*				*               //2//3  i>1 && i<n/2 then print space and initialize space = n/2-1
				*				*               //2//3
				*				*               //2//3
*	*	*	*	*	*	*	*	*               //9//0
*				*               				//2//3
*				*               				//2//3
*				*               				//2//3
*				*	*	*	*	*               //5//3
*/