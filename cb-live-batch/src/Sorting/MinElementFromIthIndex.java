package Sorting;

public class MinElementFromIthIndex {
    public static int minElementFromIthIndex(int[] arr, int n, int i){
        int minIdx = i;
        for(int j=i+1;j<n;j++){
           if(arr[j]<arr[minIdx]){
               minIdx=j;
           }
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] arr= {4,-1,5,3,2,1,7};
        int i = 2;
        int n = arr.length;
        System.out.println(minElementFromIthIndex(arr,n,i));
    }
}
