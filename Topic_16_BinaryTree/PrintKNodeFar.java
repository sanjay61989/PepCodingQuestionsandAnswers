package Topic_16_BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

class PrintKNodeFar {

    public static class Node {
        Node left;
        Node right;
        int data;

        Node(Integer data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
//        String[] values = "50 25 12 n n 37 30 n n n 75 62 n 70 n 85 n n 87 n n".split(" ");
        String[] values = "50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n".split(" ");
        Integer[] arr = new Integer[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals("n") == true) {
                arr[i] = null;
            } else {
                arr[i] = Integer.parseInt(values[i]);
            }
        }
        BinaryTreeKFar tree = new BinaryTreeKFar();
        Node root = tree.construct(arr);
        int k = 2;
        int data = 37;
        System.out.println("Printing " + k + " Nodes far from " + data);
        tree.printKNodesFar(root, data, k);
      
    }

    static class BinaryTreeKFar {
        private class Pair {
            Node node;
            int state;

            public Pair(Node node, int state) {
                this.node = node;
                this.state = state;
            }
        }

        private Node construct(Integer[] arr) {
            Stack<Pair> stack = new Stack<>();
            Node root = new Node(arr[0], null, null);
            Pair pair = new Pair(root, 1);
            stack.push(pair);
            int idx = 1;
            while (!stack.isEmpty()) {
                Pair peek = stack.peek();
                if (peek.state == 1) {
                    Integer data = arr[idx];
                    if (data != null) {
                        Node node = new Node(data, null, null);
                        peek.node.left = node;
                        Pair lp = new Pair(node, 1);
                        stack.push(lp);
                    }
                    peek.state++;
                    idx++;
                } else if (peek.state == 2) {
                    Integer data = arr[idx];
                    if (data != null) {
                        Node node = new Node(data, null, null);
                        peek.node.right = node;
                        Pair rp = new Pair(node, 1);
                        stack.push(rp);
                    }
                    peek.state++;
                    idx++;
                } else if (peek.state == 3) {
                    stack.pop();
                }
            }
            return root;
        }

        public static ArrayList<Node> nodeToRootPath(Node node, int data) {
            // write your code here
            if (node == null) {
                return new ArrayList<>();
            }
            if (node.data == data) {
                ArrayList<Node> list = new ArrayList<>();
                list.add(node);
                return list;
            }
            ArrayList<Node> leftList = nodeToRootPath(node.left, data);
            if (leftList.size() > 0) {
                leftList.add(node);
                return leftList;
            }
            ArrayList<Node> rightList = nodeToRootPath(node.right, data);
            if (rightList.size() > 0) {
                rightList.add(node);
                return rightList;
            }
            return new ArrayList<>();
        }

        public static void printKLevelsDown(Node node, int k, Node blocker) {
            if (node == null || k < 0 || node == blocker) {
                return;
            }
            if (k == 0) {
                System.out.println(node.data);
                return;
            }
            printKLevelsDown(node.left, k - 1, blocker);
            printKLevelsDown(node.right, k - 1, blocker);
        }

        public static void printKNodesFar(Node node, int data, int k) {
            ArrayList<Node> nodeToRootPath = nodeToRootPath(node, data);
            for (int i = 0; i < nodeToRootPath.size(); i++) {
                printKLevelsDown(nodeToRootPath.get(i), k - i, i > 0 ? nodeToRootPath.get(i - 1) : null);
            }
        }


    }
}