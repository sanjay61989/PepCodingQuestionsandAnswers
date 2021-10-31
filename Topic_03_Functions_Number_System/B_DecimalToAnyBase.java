package Topic_03_Functions_Number_System;

import java.util.Scanner;

public class B_DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getDecimalInBase(n, b);
		System.out.println(dn);
	}

	private static int getDecimalInBase(int n, int b) {
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

}