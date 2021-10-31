package Topic_03_Functions_Number_System;

import java.util.*;

public class A_DigitFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();

		int freq = getDigitFrequency(n, d);
		System.out.println(freq);
	}

	public static int getDigitFrequency(int n, int digit) {
		// write code here
		int c = 0;
		while (n > 0) {
			int rem = n % 10; 
			if (rem == digit)
				c++;
			n = n / 10;
		}
		return c;
	}

}