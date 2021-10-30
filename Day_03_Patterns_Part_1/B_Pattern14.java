package Day_03_Patterns_Part_1;

import java.util.*;

public class B_Pattern14 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int x = scn.nextInt();

    for(int ja = 1; ja <= 10; ja++){
        System.out.println(x + " * " + ja + " = " + (x * ja));
    }

  }
}
/*

Sample Input
3

Sample Output
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30
*/
