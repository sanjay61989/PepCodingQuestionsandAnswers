package Day_03_Patterns_Part_1;

import java.util.Scanner;

public class C_Pattern15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nsp = n / 2;
		int nst = 1;
		int val = 1;
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nsp; j++) {
				System.out.print("\t");
			}
			
			int temp = val;
			for (int j = 1; j <= nst; j++) {
				System.out.print(temp + "\t");
				if (j < nst / 2 + 1)
					temp++;
				else
					temp--;
			}

			if (i < (n / 2 + 1)) {
				nst = nst + 2;
				nsp--;
				val++;
			} else {
				nst = nst - 2;
				nsp++;
				val--;
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
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
*/