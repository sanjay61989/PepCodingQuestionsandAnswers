package Topic_14_Stacks;

import java.util.*;

public class StackDemo2 {

	public static void main(String[] args) {
		// Write your code here

		Stack<String> stack = new Stack<>(); // push, pop, peek are all 0(1)

		stack.push("Hello"); // "Hello"
		stack.push("Bye"); // "Hello", "Bye"
		stack.push("World"); // "Hello", "Bye", "World"

		while (stack.size() > 0) {
			String tos = stack.peek();
			System.out.println(tos);
			stack.pop();
		}
	}
}