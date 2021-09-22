package Day_1_Getting_Started_1;

import java.util.Scanner;

import Utilities.Utilities;

public class D_CountDigitsInANumber_4  {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		CountDigitsInANumber(n);
	}
	
	static void CountDigitsInANumber(int number) {
		System.out.println("Count Digits In A Number");
		int c = 0;
		while (number != 0) {
			number = number / 10;
			c++;
		}
		System.out.println(c);
	}
}