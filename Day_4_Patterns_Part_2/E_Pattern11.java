package Day_4_Patterns_Part_2;

import java.util.*;

public class E_Pattern11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		// write ur code here
		int nst = 1;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nst; j++) {
				System.out.print(val + "\t");
				val++;
			}
			System.out.println();
			nst++;
		}

	}
}

/*
Sample Input
5

Sample Output
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15
*/