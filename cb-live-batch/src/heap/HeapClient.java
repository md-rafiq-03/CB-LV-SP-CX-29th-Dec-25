package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapClient {


    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(5);
        heap.add(7);
        heap.add(9);
        heap.add(4);
        heap.add(2);
        heap.add(3);

        System.out.println(heap.getMin());
        heap.remove();
        System.out.println(heap.getMin());
        heap.remove();
        System.out.println(heap.getMin());

        System.out.println("Inbuilt PQ");
        // Min PQ
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(7);

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());

        // Max PQ
        System.out.println("Inbuilt Max PQ");
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((a, b) -> b-a);
        maxPq.add(8);
        maxPq.add(10);
        System.out.println(maxPq.peek());
        maxPq.remove();
        System.out.println(maxPq.peek());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(7);
        list.add(5);

        System.out.println("heap sort");
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(list);
        heapSort.print(list);

    }
}
