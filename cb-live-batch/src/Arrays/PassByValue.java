package Arrays;

public class PassByValue {
    // pass by ref ku nahi hai
    public static void update(int[] arr){
        int n = arr.length; // how to find length
        arr[2] = 1000;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr[2]);

        update(arr);

        System.out.println(arr[2]);
    }
}
