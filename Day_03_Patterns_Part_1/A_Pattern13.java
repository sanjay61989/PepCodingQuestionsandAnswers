package Day_03_Patterns_Part_1;

import java.util.*;

public class A_Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int nck = 1;
		for (int n = 0; n < rows; n++) {
			nck = 1;
			for (int k = 0; k <= n; k++) {
				System.out.print(nck + "\t");
				int n_minus_k = n - k;
				int kplus1 = k + 1;
				nck = (nck * n_minus_k) / (kplus1);
			}
			System.out.println();
		}
	}
}

/*
Sample Input
5

Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	
*/