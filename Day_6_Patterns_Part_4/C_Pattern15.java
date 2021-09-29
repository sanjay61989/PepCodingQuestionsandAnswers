package Day_6_Patterns_Part_4;
import java.util.*;

public class C_Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int stars = 1;
        int spaces = n / 2;
        int val = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }

            int ival = val;
            for(int j = 1; j <= stars; j++){
                System.out.print(ival + "\t");
                if(j <= stars / 2){
                    ival++;
                } else {
                    ival--;
                }
            }

            if(i <= n / 2){
                stars += 2;
                spaces--;
                val++;
            } else {
                stars -= 2;
                spaces++;
                val--;
            }
          
            System.out.println();
        }

    }
}