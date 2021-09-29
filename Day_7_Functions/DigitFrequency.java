package Day_7_Functions;

import java.util.*;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();

		int freq = getDigitFrequency(n, d);
		System.out.println(freq);
	}

	public static int getDigitFrequency(int num, int dig) {
		int f = 0;

		while (num > 0) {
			int rem = num % 10;
			num = num / 10;

			if (rem == dig) {
				f++;
			}
		}

		return f;
	}

}