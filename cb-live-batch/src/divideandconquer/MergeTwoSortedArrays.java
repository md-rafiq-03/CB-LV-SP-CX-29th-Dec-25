package divideandconquer;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {


    public static void main(String[] args) {
        int[] arr1 = {1,3,4,8,10};
        int[] arr2 = {2,5,6,7,9,11};
        List<Integer> merged = new ArrayList<>();
        int n= arr1.length;
        int m = arr2.length;

        int i=0,j=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                merged.add(arr1[i++]);
            }else{
                merged.add(arr2[j++]);
            }
        }

        while(j<m){
            merged.add(arr2[j++]);
        }

        while(i<n){
            merged.add(arr1[i++]);
        }

        System.out.println(merged);
    }

}
