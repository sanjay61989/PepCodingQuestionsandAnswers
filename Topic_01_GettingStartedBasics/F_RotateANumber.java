package Topic_01_GettingStartedBasics;

import java.util.Scanner;

public class F_RotateANumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int howMuchToRotate = s.nextInt();
		rotateANumber(number, howMuchToRotate);
	}

	static void rotateANumber(int n, int howMuchToRotate) {
		int nod = countDigits(n);
		int k = howMuchToRotate;
		k = k % nod;
		if (k < 0) {
			k = k + nod;
		}

		int div = (int) Math.pow(10, k);
		int mult = (int) Math.pow(10, nod - k);

		int q = n / div;
		int r = n % div;
		int ans = r * mult + q;
		System.out.println(ans);
	}

	static int countDigits(int number) {
		int c = 0;
		while (number != 0) {
			number = number / 10;
			c++;
		}
		return c;
	}
}