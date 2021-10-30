package Day_12_Recursion;

import java.util.*;

public class H_TowerOfHonoi {
	public static void toh(int n, int src, int dest, int help) {
		if (n == 0) {
			return;
		}
		toh(n - 1, src, help, dest);
		System.out.println(n + "[" + src + " -> " + dest + "]");
		toh(n - 1, help, dest, src);
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t1 = scn.nextInt();
		int t2 = scn.nextInt();
		int t3 = scn.nextInt();
		toh(n, t1, t2, t3);
	}
}
