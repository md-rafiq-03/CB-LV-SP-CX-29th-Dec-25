package Stacks;


public class MyStackClient{
    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());


        MyStack<String> st = new MyStack<>();
        st.push("abc");
        st.push("def");

        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());


    }
}
