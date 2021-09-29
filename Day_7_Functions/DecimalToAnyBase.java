package Day_7_Functions;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getDecimalInBase(n, b);
		System.out.println(dn);
	}

	public static int getDecimalInBase(int n, int b) {
		int ans = 0;

		int p = 1; // 10 ^ 0
		while (n > 0) {
			int rem = n % b;
			n = n / b;

			ans = ans + rem * p;
			p = p * 10;
		}

		return ans;
	}

}