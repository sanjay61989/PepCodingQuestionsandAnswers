package Topic_07_Recursion;

import java.io.*;
import java.util.*;

public class E_PowerLinear {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int rv = power(x, n);
		System.out.print(rv);
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

}