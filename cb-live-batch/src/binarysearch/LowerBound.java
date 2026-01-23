package binarysearch;

public class LowerBound {
    static int lowerBound(int[] arr , int x, int n){
        int lo = 0;
        int hi = n-1;
        int lb = n;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return lb;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,9,10};
        int n = arr.length;
        int x = 5;
        System.out.println(lowerBound(arr, 5, n));
    }
}
