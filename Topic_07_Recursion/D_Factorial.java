package Topic_07_Recursion;

import java.io.*;
import java.util.*;

public class D_Factorial {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner s = new Scanner(System.in);
		int rv = factorial(s.nextInt());
		System.out.println(rv);
	}

	public static int factorial(int n) {
		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}

}
