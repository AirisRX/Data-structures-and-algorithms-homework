// Airidas Rupšas - JNII21

import java.util.Stack;

public class Main {
        public static void main(String[] args) {
                Stack<Integer> stack = new Stack<Integer>();
                stack.push(1);
                stack.push(2);
                stack.push(3);
                stack.push(4);
                stack.push(5);

                System.out.println(stack.peek());
                System.out.println(stack.search(10));
                System.out.println(stack.get(1));
                stack.remove(1);
                System.out.println(stack.get(1));

                while (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                }
        }
}