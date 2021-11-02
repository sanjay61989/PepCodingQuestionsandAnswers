package Topic_01_GettingStartedBasics;

import java.util.Scanner;

public class A_IsANumberPrime_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			CheckPrimeWithDisplay(scn.nextInt());
		}
	}

	static void CheckPrimeWithDisplay(int number) {
		int flag = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
