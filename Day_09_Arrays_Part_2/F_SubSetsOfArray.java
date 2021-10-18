package Day_09_Arrays_Part_2;

import java.util.Scanner;

public class F_SubSetsOfArray {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		SubSetOfArrays(arr);
	}

	private static void SubSetOfArrays(int[] a) {
		int p = (int) Math.pow(2, a.length);
		for (int i = 0; i < p; i++) {
			int temp = i;
			String set = "";
			for (int j = a.length - 1; j >= 0; j--) {
				int rem = temp % 2;
				temp = temp / 2;
				if (rem == 0) {
					set = "-\t" + set;
				} else {
					set = a[j] + "\t" + set;
				}
			}
			System.out.println(set);
		}
	}

}