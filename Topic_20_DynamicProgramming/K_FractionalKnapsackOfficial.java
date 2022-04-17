package Topic_20_DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;


public class K_FractionalKnapsackOfficial {

    static class Item implements Comparable<Item> {

        int val;

        int wt;

        double vwRatio;


        public int compareTo(Item o) {

            if (this.vwRatio < o.vwRatio) {

                return -1;

            } else if (this.vwRatio > o.vwRatio) {

                return +1;

            } else {

                return 0;

            }

        }

    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {

            items[i] = new Item();

            items[i].val = scn.nextInt();

        }


        for (int i = 0; i < n; i++) {

            items[i].wt = scn.nextInt();

            items[i].vwRatio = items[i].val * 1.0 / items[i].wt;

        }


        Arrays.sort(items);


        double vib = 0;

        int space = scn.nextInt();


        int i = n - 1;


        while (space > 0 && i >= 0) {

            if (space >= items[i].wt) {

                vib = vib + items[i].val;

                space = space - items[i].wt;

            } else {

                vib = vib + (space * items[i].val * 1.0) / items[i].wt;

                space = 0;

                break;

            }

            i--;

        }


        System.out.println(vib);

    }


}