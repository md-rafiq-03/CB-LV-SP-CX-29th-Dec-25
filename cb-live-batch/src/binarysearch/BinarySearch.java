package binarysearch;

public class BinarySearch {

    private static int BinarySearch(int[] arr,int element){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==element){
                return mid;
            }else if(arr[mid]<element){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8,9,10,12};
        int element = 13;
        System.out.println(BinarySearch(arr,element));

    }
}


