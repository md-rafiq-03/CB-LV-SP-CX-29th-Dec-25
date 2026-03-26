package Stacks;


import java.util.Stack;

public class AddElementToLast {
    // non-static
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

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        int element = 7;
        AddElementToLast addElementToLast = new AddElementToLast();
        addElementToLast.addElementToLast(stack, element);

        // print stack
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
