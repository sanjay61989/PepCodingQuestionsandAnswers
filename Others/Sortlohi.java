package Others;

import java.util.*;

public class Sortlohi {

	public static void sort012(int[] arr, int lo, int hi) {
		//write your code here
		int i = 0;
		int j = 0;
		int k = arr.length - 1;

		// 0 to j - 1 => is all 0's
		// j to i - 1 => is all 1's
		// i to k => unknowns
		// k + 1 to end => is all 2's
		while (i <= k) {
			if (arr[i] >= lo && arr[i] <= hi) {
				i++;
			} else if (arr[i] > hi) {
				swap(arr, i, k);
				k--;
			} else {
				// i.e it is 0
				swap(arr, i, j);
				i++;
				j++;
			}
		}

	}

	// used for swapping ith and jth elements of array
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping index " + i + " and index " + j);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		sort012(arr, n, n);
		print(arr);
	}

}