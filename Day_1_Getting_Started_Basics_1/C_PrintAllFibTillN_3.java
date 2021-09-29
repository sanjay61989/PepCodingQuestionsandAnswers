package Day_1_Getting_Started_Basics_1;

import java.util.*;

public class C_PrintAllFibTillN_3  {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintFibonacciNumbersUptoValue_N(s.nextInt());
	}
	
	static void PrintFibonacciNumbersUptoValue_N(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}