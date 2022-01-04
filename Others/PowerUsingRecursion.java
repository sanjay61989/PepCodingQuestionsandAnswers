package Others;

import java.util.*;

public class PowerUsingRecursion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();

		int xpn = power3(x, n);
		System.out.println(xpn);
	}

	public static int power1(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpnm1 = power1(x, n - 1);
		int xpn = xpnm1 * x;

		return xpn;
	}

	public static int power2(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpb2 = power1(x, n / 2);
		int xpn = xpb2 * xpb2;

		if (n % 2 == 1) {
			xpn = xpn * x;
		}

		return xpn;
	}

	public static int power3(int x, int n) {
		if (n == 0) {
			return 1;
		}

		if (n % 2 == 0) {
			return power3(x, n / 2) * power3(x, n / 2);
		} else {
			return x * power3(x, n / 2) * power3(x, n / 2);
		}
	}
}