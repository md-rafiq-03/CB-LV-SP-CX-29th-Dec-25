package Stacks;

public class MyStack<E> {
    private final Object[] stack;
    private int idx;
    private final int LENGTH;

    public MyStack() {
        LENGTH = 1000;
        stack = new Object[LENGTH];
        idx = -1;
    }

    public boolean isEmpty(){
        return idx==-1;
    }

    public Object push(E element) throws Exception{
        if(size() == LENGTH){
            throw new Exception("Stack Overflow!!");
        }
        stack[++idx] = element;
        return element;
    }

    public int size(){
        return idx+1;
    }

    public Object peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty !!");
        }
        return stack[idx];
    }

    public Object pop() throws Exception{
//        int element = stack[idx];
//        idx--;
//        return element;
        if(isEmpty()){
            throw new Exception("Stack is Empty, can't pop !!");
        }
        return stack[idx--];
    }


}

