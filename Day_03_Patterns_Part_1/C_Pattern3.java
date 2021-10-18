package Day_03_Patterns_Part_1;
import java.util.Scanner;

public class C_Pattern3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
/*

I/P
5

O/P
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*

*/