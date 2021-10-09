package Day_1_Getting_Started_Basics_1;

import java.util.*;

public class B_PrintAllPrimesTillN_2  {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int low = s.nextInt();
		int high = s.nextInt();
		PrintPrimeNumbersBetweenRange(low, high);
	}

	static void PrintPrimeNumbersBetweenRange(int low, int high) {
		for (int i = low; i <= high; i++) {
			int flag = CheckPrime(i);
			if (flag == 0)
				System.out.println(i);
		}
	}

	static int CheckPrime(int number) {
		int isPrime = 0;
		for (int i = 2; i*i <= number; i++) {
			if (number % i == 0) {
				isPrime = 1;
				break;
			}
		}
		return isPrime;
	}
}