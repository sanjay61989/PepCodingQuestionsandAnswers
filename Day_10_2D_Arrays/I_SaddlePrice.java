package Day_10_2D_Arrays;

import java.util.Scanner;

public class I_SaddlePrice {
	public static void main(String[] args) throws Exception {
		// write your code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[][] = new int[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		//traversing row by row and finding the least element column index and then checking in that 
		//column if there is any element greater than this or not.
		
		for (int i = 0; i < ar.length; i++) {

			int lci = 0;
			for (int j = 1; j < ar[0].length; j++) {
				if (ar[i][j] < ar[i][lci]) {
					lci = j;
				}
			}

			boolean flag = true;
			for (int k = 0; k < ar.length; k++) {

				if (ar[k][lci] > ar[i][lci]) {
					flag = false;
					break;
				}

			}
			if (flag == true) {
				System.out.println(ar[i][lci]);
				return;
			}

		}

		System.out.println("Invalid input");

	}

}
