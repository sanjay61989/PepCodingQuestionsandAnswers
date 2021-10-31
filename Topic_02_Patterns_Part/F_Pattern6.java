package Topic_02_Patterns_Part;
import java.util.Scanner;
public class F_Pattern6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nosp = 1;
		int nost = n / 2 + 1;
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = 1; j <= nost; j++) {
				System.out.print("*\t");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= nost; j++) {
				System.out.print("*\t");
			}
			nost--;
			System.out.println();
		}
		nosp = n - 2;
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*\t");
			}
			for (int j = 1; j <= nosp; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*\t");
			}
			nosp = nosp - 2;
			System.out.println();
		}

	}
}

/*  
I/P
5

O/P
*	*	*	*		*	*	*	*
*	*	*				*	*	*	
*	*						*	*	
*								*	
*	*						*	*	
*	*	*				*	*	*
*	*	*	*		*	*	*	*

*/