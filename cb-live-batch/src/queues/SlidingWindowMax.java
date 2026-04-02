package queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMax {
    private static List<Integer> solve(int[] arr, int k){
        int i=0;
        int j=0;
        int n= arr.length;
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        while(j<n){
            // j-k => out of window
            if(!dq.isEmpty() && dq.peekFirst()<=j-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[j]){
                dq.pollLast();
            }

            dq.addLast(j);
            if(j>=k-1){
                list.add(arr[dq.peekFirst()]);
            }
            j++;
        }
        list.toArray(new Integer[0]);
        return list;
    }
    public static void main(String[] args) {
       int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(solve(nums, k));
    }
}
