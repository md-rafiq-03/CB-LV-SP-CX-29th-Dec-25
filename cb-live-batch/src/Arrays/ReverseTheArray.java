package Arrays;

public class ReverseTheArray {
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 , 5, 6};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ ", ");
        }
    }
}
