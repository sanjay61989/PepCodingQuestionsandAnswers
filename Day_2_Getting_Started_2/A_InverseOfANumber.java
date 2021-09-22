package Day_2_Getting_Started_2;

import java.util.Scanner;

public class A_InverseOfANumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		System.out.println(inverse_of_a_number(number));
	}

	static int inverse_of_a_number(int number) {
		int count = 1;
		int rem;
		int ans = 0;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			ans = ans + count * ((int) Math.pow(10, rem - 1));
			count++;
		}
		return ans;
	}
}