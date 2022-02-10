package Topic_15_Trees;

import java.util.*;

public class PracticeGenericTree {

	public static class Node {

		Node(int data) {
			this.data = data;
		}

		public Node() {}

		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private static Node construct(int[] arr) {
		Stack<Node> s = new Stack<>();
		Node root = new Node();
		for (int data : arr) {
			if (data == -1) {
				s.pop();
			} else {
				Node n = new Node(data);
				if (s.size() == 0) {
					root = n;
					s.push(n);
				} else {
					Node temp = s.peek();
					temp.children.add(n);
					s.push(n);
				}
			}
		}
		return root;
	}

	public static void display(Node node) {
		// Print self and its children data
		String str = node.data + " -> ";
		for (Node child : node.children) {
			str += child.data + ", ";
		}
		str += ".";
		System.out.println(str);

		// Then make a call for display each children
		// faith is children know how to display of its children
		for (Node child : node.children) {
			display(child);
		}
	}

	public static int size(Node node) {
		// write your code here
		int sz = 1;
		for (Node n : node.children) {
			sz += size(n);
		}
		return sz;
	}

	public static int max(Node node) {
		int max = node.data;
		for (Node n : node.children) {
			int data = max(n);
			if (data > max)
				max = data;
		}
		return max;
	}

	public static int height(Node node) {
		// write your code here
		int h = -1;
		for (Node n : node.children) {
			int res = height(n);
			if (res > h) {
				h = res;
			}
		}
		return h + 1;
	}

	public static void traversals(Node node) {
		System.out.println("Node Pre " + node.data);
		for (Node n : node.children) {
			System.out.println("Edge Pre " + node.data + "--" + n.data);
			traversals(n);
			System.out.println("Edge Post " + node.data + "--" + n.data);
		}
		System.out.println("Node Post " + node.data);
	}

	public static void levelOrder(Node root) {
		LinkedList<Node> q = new LinkedList<>();
		q.addLast(root);
		while (q.size() > 0) {
			Node first = q.removeFirst();
			System.out.print(first.data + " ");
			for (Node ch : first.children) {
				q.addLast(ch);
			}
		}
		System.out.print(".");
		System.out.println(".");
	}

	public static void levelOrderLinewise(Node root) {
		Queue<Node> queue = new ArrayDeque<Node>();
		Queue<Node> cqueue = new ArrayDeque<Node>();

		queue.add(root);
		while (queue.size() > 0) {
			Node temp = queue.remove();
			System.out.print(temp.data + " ");
			for (Node child : temp.children) {
				cqueue.add(child);
			}

			if (queue.size() == 0) {
				queue = cqueue;
				cqueue = new ArrayDeque<>();
				System.out.println("");
			}
		}
	}


	public static void mirror(Node node) {
		// write your code here
		for (Node child : node.children) {
			mirror(child);
		}
		Collections.reverse(node.children);
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1,
				40, 100, -1, -1, -1};
		Node root = construct(arr);
		display(root);
		int size = size(root);
		System.out.println("Size : " + size);
		int max = max(root);
		System.out.println("Maximum : " + max);
		int height = height(root);
		System.out.println("Height : " + height);
		System.out.println("Level Order");
		levelOrder(root);
		System.out.println("Level Order Line Wise");
		levelOrderLinewise(root);
	}

}
