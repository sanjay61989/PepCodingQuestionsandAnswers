package Day_07_Functions_Number_System;

import java.util.Scanner;

public class D_AnyBaseToAnyBase {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int srcBase = scn.nextInt();
		int destBase = scn.nextInt();
		int rv = anyBaseToDecimal(n, srcBase);
		rv = getDecimalToAnyBase(rv, destBase);
		System.out.println(rv);
	}

	private static int getDecimalToAnyBase(int n, int b) {
		// TODO Auto-generated method stub
		int rv = 0;
		int d = 0;
		int p = 1;
		while (n > 0) {
			d = n % b;
			n = n / b;

			rv = rv + (d * p);
			p = p * 10;
		}
		return rv;
	}

	private static int anyBaseToDecimal(int n, int b) {
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