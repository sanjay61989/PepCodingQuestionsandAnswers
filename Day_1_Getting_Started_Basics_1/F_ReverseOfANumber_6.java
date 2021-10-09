package Day_1_Getting_Started_Basics_1;

import java.util.Scanner;

public class F_ReverseOfANumber_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ReverseNumber(n);
	}

	static void ReverseNumber(int n) {
		int temp = 0;
		while (n != 0) {
			temp = n % 10;
			System.out.println(temp);
			n = n / 10;
		}
	}
}
