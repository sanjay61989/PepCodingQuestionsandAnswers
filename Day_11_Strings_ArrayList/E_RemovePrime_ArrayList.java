package Day_11_Strings_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class E_RemovePrime_ArrayList {
	public static void solution(ArrayList<Integer> al) {
		for (int i = al.size()-1; i >= 0; i--) {
			int ele = al.get(i);
			if (isPrime(ele) == true) {
				al.remove(i);
			}
		}
	}

	static boolean isPrime(int number) {
		for (int div = 2; div * div <= number; div++) {
			if (number % div == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}