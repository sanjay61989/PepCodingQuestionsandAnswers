package Others;

import java.util.*;

public class FibonacciRecursion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fn = fib(n);
		System.out.println(fn);
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}
}