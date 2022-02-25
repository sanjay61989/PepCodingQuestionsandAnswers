package Topic_15_Trees;

import java.io.*;
import java.util.*;

public class DiamterTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    static int dia = 0;

    public static int diameter(Node node) {
        // write your code here
        int dch = -1;
        int sdch = -1;
        for (Node n : node.children) {
            int ch = diameter(n);
            if (ch >= dch) {
                sdch = dch;
                dch = ch;
            } else if (ch >= sdch) {
                sdch = ch;
            }
        }
        int cand = dch + sdch + 2;
        if (cand > dia) {
            dia = cand;
        }
        dch += 1;
        return dch;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());

        // String[] values = "10 20 50 -1 60 -1 -1 30 70 -1 80 110 130 150 170 -1 -1 -1 -1 120 140
        // 160 180 190 -1 -1 -1 -1 -1 -1 90 -1 -1 40 100 -1 -1 -1".split(" ");
        String[] values =
                "10 20 50 -1 60 -1 -1 30 70 -1 80 110 130 150 170 -1 -1 -1 -1 120 140 160 180 190 -1 -1 -1 -1 -1 -1 90 -1 -1 40 100 -1 -1 -1"
                        .split(" ");
        int[] arr = new int[values.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        // write your code here
        int d = diameter(root);
        System.out.println(dia);
    }

}
