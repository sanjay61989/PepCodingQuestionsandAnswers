package Day_7_Functions;

import java.util.Scanner;

public class C_AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getBaseInDecimal(n, b);
		System.out.println(dn);
	}

	private static int getBaseInDecimal(int n, int b) {
		// TODO Auto-generated method stub
		int rv = 0;
		int p = 1;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			rv = rv + (rem * p);
			p = p * b;
		}
		return rv;
	}

}