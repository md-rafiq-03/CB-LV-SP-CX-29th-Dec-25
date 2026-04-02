package queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.isEmpty());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);

        dq.removeFirst();
        dq.removeLast();;

        dq.peekFirst();
        dq.peekLast();

        dq.isEmpty();
        dq.size();
    }
}
