package Day_1_Getting_Started_Basics_1;

import java.util.*;

public class E_DisplayDigitOfANumber_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		DisplayDigitOfANumber(n);
	}

	static void DisplayDigitOfANumber(int n) {
		int temp = n;
		int div = CalculateDivisor(n);
		while (div >= 1) {
			int quotient = temp / div;
			temp = temp % div;
			System.out.println(quotient);
			div = div / 10;
		}
	}

	static int CalculateDivisor(int number) {
		int div = 1;
		while (number >= 10) {
			number = number / 10;
			div = div * 10;
		}
		return div;
	}
}