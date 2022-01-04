package Topic_02_Patterns;

import java.util.*;

public class L_Pattern12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		// write ur code here
		int nst = 1;
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nst; j++) {
				System.out.print(a + "\t");
				int c = a + b;
				a = b;
				b = c;
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
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	
 
*/