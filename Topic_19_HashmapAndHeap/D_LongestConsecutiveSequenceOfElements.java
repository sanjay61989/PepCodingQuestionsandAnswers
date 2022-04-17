package Topic_19_HashmapAndHeap;

import java.util.HashMap;
import java.util.Scanner;

public class D_LongestConsecutiveSequenceOfElements {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        HashMap<Integer, Boolean> hm = new HashMap();
        for (int val : a) {
            hm.put(val, true);
        }
        for (int val : a) {
            if (hm.containsKey(val - 1)) {
                hm.put(val, false);
            }
        }
        int mh = 0;
        int mval = 0;
        for (int val : a) {
            if (hm.get(val) == true) {
                int lh = 1;
                int lval = val;
                while (hm.containsKey(lval + lh)) {
                    lh++;
                }
                if (lh > mh) {
                    mh = lh;
                    mval = val;
                }
            }
        }
        for (int i = 0; i < mh; i++) {
            System.out.println(mval + i);

        }
    }
}