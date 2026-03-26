package oops;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueueClient {
    public static void main(String[] args) throws Exception {
//            MyQueue queue = new MyQueue(5);
//            queue.add(10);
//            queue.add(20);
//            queue.add(30);
//            queue.add(40);
//            queue.add(50);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.element());

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
