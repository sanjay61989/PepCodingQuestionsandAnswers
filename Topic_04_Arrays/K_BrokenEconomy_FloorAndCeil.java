package Topic_04_Arrays;
import java.io.*;
import java.util.*;

public class K_BrokenEconomy_FloorAndCeil{

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int data = scn.nextInt();

		int left = 0;
		int right = arr.length - 1;

		int floor = -1; // the greatest among smaller numbers
		int ceil = -1; // the smallest among greater numbers

		while (left <= right) {
			int mid = (left + right) / 2;

			if (data > arr[mid]) {
				left = mid + 1;
				// left to mid are all small and mid is greatest of them
				floor = arr[mid];
			} else if (data < arr[mid]) {
				right = mid - 1;
				// mid to right are all greater and mid is the smallest of them
				ceil = arr[mid];
			} else {
				floor = arr[mid];
				ceil = arr[mid];
				break;
			}
		}

		System.out.println(ceil);
		System.out.println(floor);
	}

}