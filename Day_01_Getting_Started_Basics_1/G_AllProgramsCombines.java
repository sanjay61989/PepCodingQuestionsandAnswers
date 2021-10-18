package Day_01_Getting_Started_Basics_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class G_AllProgramsCombines {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(111);

		System.out.println("B_PrintAllPrimesTillN_2");
		PrintPrimeNumbersBetweenRange(10, 40);

		System.out.println("C_PrintAllFibTillN_3");
		PrintFibonacciNumbersUptoValue_N(10);

		System.out.println("D_CountDigitsInANumber_4");
		CountDigitsInANumber(63652);

		// PrintDigitsInANumberMethod1UsingArraylist(2567);
		// PrintDigitsInANumberMethod2UsingStringClass(124578);
		// PrintDigitsInANumberMethod3UsingRecursion(987365);

		System.out.println("E_DisplayDigitOfANumber_5");
		DisplayDigitOfANumber(12340890);

		System.out.println("F_ReverseOfANumber_6");
		ReverseNumber(56421);
	}

	static void ReverseNumber(int n) {
		System.out.println("Reverse of a number is "+n);
		int temp = 0;
		while (n != 0) {
			temp = n % 10;
			System.out.println(temp);
			n = n / 10;
		}
	}

	static void PrintDigitsInANumberMethod1UsingArraylist(int number) {
		System.out.println("Printing Digits In A Number Method 1 Using Arraylist class");
		int temp = number;
		ArrayList<Integer> n = new ArrayList<Integer>();
		while (temp != 0) {
			number = number % 10;
			temp = temp / 10;
			n.add(number);
			number = temp;
		}
		Collections.reverse(n);
		printElementsUsingArrayList(n);
	}

	static void PrintDigitsInANumberMethod2UsingStringClass(int number) {
		System.out.println("Printing Digits In A Number Method 2 Using String Class");
		String s = Integer.valueOf(number).toString();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
	}

	static void PrintDigitsInANumberMethod3UsingRecursion(int number) {

		int r;
		// Base Case
		if (number == 0) {
			return;
		}

		// Extract the last digit
		r = number % 10;

		// Recursive call to next
		// iteration
		PrintDigitsInANumberMethod3UsingRecursion(number / 10);
		// Print r
		System.out.println(r);
	}

	static void PrintDigitsInANumber(int number) {
		System.out.println("Print Digits In A Number");
		int c = 0;
		while (number != 0) {
			number = number / 10;
			c++;
		}
		System.out.println(c);
	}

	static void CountDigitsInANumber(int number) {
		System.out.println("Count Digits In A Number "+number);
		int c = 0;
		while (number != 0) {
			number = number / 10;
			c++;
		}
		System.out.println(c);
	}

	static void PrintFibonacciNumbersUptoValue_N(int n) {
		System.out.println("Printing Fibonacci Numbers Upto Value N " + n);
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		System.out.print("\n");
	}

	static void PrintPrimeNumbersBetweenRange(int low, int high) {
		System.out.println("Printing Prime Numbers Between Range " + low + " and " + high);
		for (int i = low; i <= high; i++) {
			int flag = CheckPrime(i);
			if (flag == 0)
				System.out.println(i);
		}
	}

	static int CheckPrime(int number) {
		int flag = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = 1;
				break;
			}
		}
		return flag;
	}

	static void CheckPrimeWithDisplay(int number) {
		int flag = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag > 0) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}

	static void DisplayDigitOfANumber(int n) {
		System.out.println("Digits of a number are "+n);
		int temp = n;
		//Calculating divisor
		int div = 1;
		while (n >= 10) {
			n = n / 10;
			div = div * 10;
		}
		
		//Displaying quotient
		while (div >= 1) {
			int quotient = temp / div;
			temp = temp % div;
			System.out.println(quotient);
			div = div / 10;
		}
	}

	static void printElementsUsingArrayList(ArrayList<Integer> alist) {
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i) + " ");
		}
	}

}
