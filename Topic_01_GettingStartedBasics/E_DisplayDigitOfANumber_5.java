package Topic_01_GettingStartedBasics;

import java.util.*;

public class E_DisplayDigitOfANumber_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int countDigits = countDigits(n);
		int div = (int) Math.pow(10, countDigits - 1);
		while (div != 0) {
			int q = n / div;
			System.out.println(q);
			n = n % div;
			div = div / 10;
		}
	}

	static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}