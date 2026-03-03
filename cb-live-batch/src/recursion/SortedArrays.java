package recursion;

public class SortedArrays {
    static boolean isSorted(int[] arr, int i,int n){
        // base case
        if(i==n-1)
            return true;
        if(arr[i]>arr[i+1])
            return false;
        return isSorted(arr, i+1, n);
//        // smaller
//        boolean smallerAns = isSorted(arr, i+1, n);
//        // larger
//        boolean largerAns = smallerAns;
//        // return
//        return largerAns;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3,4,5,6,7,8};
        int n = arr.length;
        System.out.println(isSorted(arr, 0, n));
    }
}
