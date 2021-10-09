package Day_2_Getting_Started_Basics_2;

import java.util.*;

public class F_CaseOfBenjaminBulb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i * i <= n; i++) {
			System.out.println(i * i);
		}
	}
}