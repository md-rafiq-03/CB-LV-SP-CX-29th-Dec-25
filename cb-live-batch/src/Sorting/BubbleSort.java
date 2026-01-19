package Sorting;

public class BubbleSort {
    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,3,2,1};
        int n = arr.length;
        print(arr);
        for(int turn =1;turn<n;turn++){
            boolean isSwapped = false;
            for(int i =0;i<n-turn;i++){
                if(arr[i]>arr[i+1]){
                    isSwapped=true;
                    swap(arr,i,i+1);
                }
            }
            if(isSwapped==false){
                break;
            }
        }
        print(arr);
    }
}
