package binarysearch;

public class SearchInRotatedSortedArray {

    public static int BS(int[] arr , int x, int n){
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            //
            // is arr[mid]==x
            if(arr[mid]==x){
                return mid ;
            } else if(arr[lo]==arr[mid] && arr[mid]==arr[hi]){
                lo++;
                hi--;
            }else if(arr[lo] <= arr[mid]){
                // is lo --> mid is sorted
                // does element exist in {lo-->hi}
                if(arr[lo]<=x && arr[mid]>x){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else{
                // mid--->hi -> sorted
                // {arr[mid]-x-arr[hi]}
                if(arr[mid]<x && arr[hi]>=x){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        int element = 100;
        int n = arr.length;
        System.out.println(BS(arr, element, n));

    }
}
