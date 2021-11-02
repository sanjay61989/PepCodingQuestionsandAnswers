package Topic_02_Patterns;
import java.util.Scanner;
public class E_Pattern5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= ((n / 2) + 1); i++) {
			// type 1
			for (int j = 1; j <= ((n / 2) - i + 1); j++) {
				System.out.print("\t");
			}

			// type 2
			for (int j = 1; j <= ((2 * i) - 1); j++) {
				System.out.print("*\t");
			}

			System.out.println();
		}

		// lower half

		for (int i = 1; i <= (n / 2); i++) {
			// type 1
			for (int j = 1; j <= i; j++) {
				System.out.print("\t");
			}

			// type 2
			for (int j = 1; j <= (n - 2 * i); j++) {
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
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*
*/
