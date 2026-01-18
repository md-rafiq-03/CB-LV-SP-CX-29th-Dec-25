package Arrays;

public class RightShiftByOne {
    public static void rotate(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = n-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        for(int i=0;i<k;i++){
            rotate(arr);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +", ");
        }
    }
}
