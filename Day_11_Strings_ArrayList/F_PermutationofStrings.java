package Day_11_Strings_ArrayList;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class F_PermutationofStrings {

	public static void PermutationOfStrings(String str) {
		int n = str.length();
		long fact = getFactorial(str.length());
		for (int i = 0; i < fact; i++) {
			int temp = i;
			StringBuilder sb = new StringBuilder(str);
			for (int j = n; j >= 1; j--) {
				int rem = temp % j;
				int q = temp / j;
				System.out.print(sb.charAt(rem));
				sb.deleteCharAt(rem);
				temp = q;
			}
			System.out.println();
		}

	}

	static long getFactorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		PermutationOfStrings(str);
	}

}