package heap;

import java.util.Collections;
import java.util.List;

public class HeapSort {
    private void downHeapify(List<Integer>  list, int parentIndex, int len){
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;
        int minChildIndex = parentIndex;

        if(leftChildIndex<len
                && list.get(leftChildIndex) < list.get(minChildIndex)){
            minChildIndex = leftChildIndex;
        }

        if(rightChildIndex<len
                && list.get(rightChildIndex)< list.get(minChildIndex)){
            minChildIndex = rightChildIndex;
        }

        if(minChildIndex!=parentIndex){
            Collections.swap(list, parentIndex, minChildIndex);
            downHeapify(list, minChildIndex, len);
        }
    }

    public void heapSort(List<Integer> list){
        int n = list.size();
        // create
        for(int i= n/2;i>=0;i--){
            downHeapify(list, i, n);
        }

        // remove
        for(int i=n-1;i>=0;i--){
            Collections.swap(list, 0, i);
            downHeapify(list, 0, i);
        }
        Collections.reverse(list);
    }

    public void print(List<Integer> list){
        for(int x : list){
            System.out.print(x + ", ");
        }
    }
}
