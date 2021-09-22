package Day_3_Patterns_Part_1;

import java.util.*;

public class D_Pattern4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i - 1; k++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= n + 1 - i; j++) {
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
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*	

*/