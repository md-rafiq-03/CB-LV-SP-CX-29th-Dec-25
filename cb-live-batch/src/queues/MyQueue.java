package queues;

public class MyQueue {
    private final int[] queue;
    private int front;
    private int rear;
    private final int capacity;
    private int size;

    public MyQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // offer(10)
    public boolean add(int element) throws Exception{
        // capacity full
        if(isFull()){
            throw new Exception("Queue capacity is full !!");
        }
        rear = (rear+1)%capacity;
        queue[rear] = element;
        size++;
        return true;
    }

    // delete and return
    // poll()
    public int remove() throws Exception{
        // queue is Empty
        if (isEmpty()){
            throw new Exception("Queue is empty !!");
        }

        int element = queue[front];
        front = (front+1)%capacity;
        size--;
        return element;
    }

    // peek -> to get the front element of the queue
    // peek()
    public int element() throws Exception{
        if(isEmpty()) {
            throw new Exception("Queue is Empty, can't do get front element operation");
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }
}
