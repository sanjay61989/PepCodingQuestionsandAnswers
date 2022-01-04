package Topic_10_RecursionOnTheWayUp;

import java.io.*;

import java.util.*;

public class C_PrintStairPaths {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		printStairPaths(t, "");
	}

	public static void printStairPaths(int n, String psf) {
		if (n <= 0) {
			if (n == 0) {
				System.out.println(psf);
			}

			return;
		}

		printStairPaths(n - 1, psf + 1);
		printStairPaths(n - 2, psf + 2);
		printStairPaths(n - 3, psf + 3);
	}
}