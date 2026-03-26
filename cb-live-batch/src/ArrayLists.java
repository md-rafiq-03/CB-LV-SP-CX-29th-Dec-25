import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // {}
        // add
        arrayList.add(10); // O(1)-> average case
        arrayList.add(20);
        arrayList.add(1, 100); // O(n)

        // get, idx ??
        int element = arrayList.get(1);
        System.out.println(element);

        // removes & returns value present at index
        Integer value = arrayList.remove(2); // O(n)
        System.out.println(value);

        //update
        arrayList.set(0,987);
        System.out.println(arrayList.get(0));

        // Sort
        int[] arr = new int[]{10,2,4,5,6};
        Arrays.sort(arr); // O(nlogn)

        Collections.sort(arrayList);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+", ");
        }

        Collections.reverse(arrayList);
        System.out.println();
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+", ");
        }
        System.out.println();

        // Iterate using for each
        for(Integer e : arrayList){
            System.out.println(e);
        }

    }
}
