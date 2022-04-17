package Topic_20_DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ZP_RussianDollEnvelopes {

    public static class Envelope implements Comparable<Envelope> { //1
        int w;
        int h;

        Envelope(int w, int h) {
            this.w = w;
            this.h = h;
        }

        public int compareTo(Envelope o) { //1
            return this.w - o.w;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine()); //2
        Envelope[] envlps = new Envelope[n];
        for (int i = 0; i < n; i++) {
            String line = scn.nextLine();
            String[] parts = line.split(" ");
            int w = Integer.parseInt(parts[0]);
            int h = Integer.parseInt(parts[1]);
            envlps[i] = new Envelope(w, h);
        }

        Arrays.sort(envlps); //4
        int[] dp = new int[n]; //5
        int omax = 0; //omax=overall max
        for (int i = 0; i < dp.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (envlps[j].h < envlps[i].h && envlps[j].w < envlps[i].w) { //6
                    if (dp[j] > max) {
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
            if (dp[i] > omax) { //7
                omax = dp[i];
            }
        }

        System.out.println(omax); //8
    }

}