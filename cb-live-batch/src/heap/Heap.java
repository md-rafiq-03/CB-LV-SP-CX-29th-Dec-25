package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Heap {
    private final List<Integer> heap;

    public Heap(){
        heap = new ArrayList<>();
    }

    public int getMin(){
        if(heap.isEmpty())
            return -1;
        return heap.get(0);
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }

    public int getSize(){
        return heap.size();
    }

    public void add(int data){
        heap.add(data);
        // upHeapify
        upHeapify(heap.size()-1);
    }

    private void upHeapify(int childIndex){
        int parentIndex = (childIndex-1)/2;
        if(heap.get(parentIndex) > heap.get(childIndex)){
            Collections.swap(heap, childIndex, parentIndex);
            upHeapify(parentIndex);
        }
    }

    public void remove(){
        Collections.swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);
        downHeapify(0);
    }

    private void downHeapify(int parentIndex){
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;
        int minChildIndex = parentIndex;

        if(leftChildIndex<heap.size()
                && heap.get(leftChildIndex) < heap.get(minChildIndex)){
            minChildIndex = leftChildIndex;
        }

        if(rightChildIndex<heap.size()
                && heap.get(rightChildIndex)< heap.get(minChildIndex)){
            minChildIndex = rightChildIndex;
        }

        if(minChildIndex!=parentIndex){
            Collections.swap(heap, parentIndex, minChildIndex);
            downHeapify(minChildIndex);
        }
    }


}
