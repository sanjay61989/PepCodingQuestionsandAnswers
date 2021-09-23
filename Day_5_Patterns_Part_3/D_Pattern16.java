package Day_5_Patterns_Part_3;

import java.util.*;

public class D_Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sop = (2 * n) - 3;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			val = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(val + "\t");
				val = val + 1;
			}
			for (int j = 1; j <= sop; j++) {
				System.out.print("\t");
			}
			int k = (i == n) ? i - 1 : i;
			val = k;
			for (int j = 1; j <= k; j++) {
				System.out.print(val + "\t");
				val--;
			}
			sop = sop - 2;
			System.out.println();
		}
	}
}

/*
Sample Input
7

Sample Output
for n=7
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	

for n=5
1						1	
1	2				2	1	
1	2	3		3	2	1	
1	2	3	4	3	2	1	
*/