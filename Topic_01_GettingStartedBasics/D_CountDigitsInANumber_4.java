package Topic_01_GettingStartedBasics;

import java.util.Scanner;

public class D_CountDigitsInANumber_4  {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		CountDigitsInANumber(n);
	}
	
	static void CountDigitsInANumber(int number) {
		
		int c = 0;
		while (number != 0) {
			number = number / 10;
			c++;
		}
		System.out.println(c);
	}
}