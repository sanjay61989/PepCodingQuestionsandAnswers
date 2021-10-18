package Day_05_Patterns_Part_3;
import java.util.*;

public class E_Pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int nsp = n / 2;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++){
                if(i == (n / 2 + 1)){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for(int j = 1; j <= nst; j++){
                System.out.print("*\t");
            }
            System.out.println();

            if(i <= n / 2){
                nst++;
            } else {
                nst--;
            }
        }
        
        

    }
}
/*
Sample Input
5

Sample Output
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	
*/