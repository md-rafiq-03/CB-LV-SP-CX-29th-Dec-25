package Sorting;

public class InsertionSort {
    public static void placeIthElementToWrightPlace(int[] arr, int i){
        int j = i-1;
        int item = arr[i];
        while(j>=0 && arr[j]>item){
            arr[j+1] = arr[j];
            arr[j]=item;
            j--;
        }
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
        for(int i=1;i<n;i++){
            placeIthElementToWrightPlace(arr,i);
        }
        print(arr);
    }
}
