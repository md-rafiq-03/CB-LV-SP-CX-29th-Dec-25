package heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        int n= nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int e : nums){
            pq.add(e);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
