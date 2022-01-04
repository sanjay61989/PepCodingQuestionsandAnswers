package Others;
import java.util.*;


public class Polynomial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int c = n;
        int pox = x;
        int ans = 0;
        while(c >= 1){
            int term = c * pox;
            ans += term;
            c--;
            pox = pox * x;
        }

        System.out.println(ans);
    }
}