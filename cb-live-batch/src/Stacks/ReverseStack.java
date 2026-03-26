package Stacks;

import java.util.Stack;

public class ReverseStack {
    private void addElementToLast(Stack<Integer> stack,
                                  int element){
        // base
        if(stack.isEmpty()){
            stack.push(element);
            return ;
        }

        int x = stack.pop();
        addElementToLast(stack, element);
        stack.push(x);
    }

    private void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return ;
        }
        int x = st.pop();
        reverseStack(st);
        addElementToLast(st, x);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.reverseStack(stack);

        // print stack
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
