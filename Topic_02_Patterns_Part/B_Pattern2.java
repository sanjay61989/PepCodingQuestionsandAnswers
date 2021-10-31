package Topic_02_Patterns_Part;
import java.util.Scanner;
public class B_Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
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
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	

*/