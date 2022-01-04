package Topic_07_Recursion;

import java.io.*;
import java.util.*;

public class C_PrintIncreasingAndDecreasing {

	public static void main(String[] args) throws Exception {
		// write your code here4
		pdi(new Scanner(System.in).nextInt());
	}

	public static void pdi(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}

}