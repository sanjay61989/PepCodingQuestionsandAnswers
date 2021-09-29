package Day_6_Patterns_Part_4;
import java.util.*;
public class B_Pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n = scn.nextInt();

   
        for(int i = 0; i < n; i++){
            int val = 1;
            // nck+1 = nck * (n - k) / (k + 1)
            for(int j = 0; j <= i; j++){
                System.out.print(val + "\t");
                val = val * (i - j) /  (j + 1);
            }
            System.out.println();
        }

    }
}