package Day_09_Arrays_Part_2;
import java.util.*;

public class H_FiAndLi{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int data = scn.nextInt();
		int left = 0;
		int right = arr.length - 1;

		int fi = -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data > arr[mid]) {
				// left side is useless, discard it
				left = mid + 1;
			} else if (data < arr[mid]) {
				// right side is useless, discard it
				right = mid - 1;
			} else {
				fi = mid;
				right = mid - 1;
			}
		}

		System.out.println(fi);

		int li = -1;
		left = 0;
		right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data > arr[mid]) {
				// left side is useless, discard it
				left = mid + 1;
			} else if (data < arr[mid]) {
				// right side is useless, discard it
				right = mid - 1;
			} else {
				li = mid;
				left = mid + 1;
			}
		}

		System.out.println(li);
	}
}