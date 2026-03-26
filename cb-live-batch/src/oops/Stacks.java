package oops;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.capacity());
        System.out.println(stack.add(1000));
        System.out.println(stack.peek());


    }

}
