package Sorting;

public class SelectionSort {
    public static int minElementFromIthIndex(int[] arr, int n, int i){
        int minIdx = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minIdx]){
                minIdx=j;
            }
        }
        return minIdx;
    }

    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr= {4,-1,5,3,2,1,7};
        int n = arr.length;
        print(arr);
        for(int i=0;i<n;i++){
            int minIdx = minElementFromIthIndex(arr,n,i);
            swap(arr,i,minIdx);
        }
        print(arr);
    }
}
