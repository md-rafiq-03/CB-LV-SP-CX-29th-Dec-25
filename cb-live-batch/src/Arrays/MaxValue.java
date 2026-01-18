package Arrays;

import java.util.Scanner;

public class MaxValue {

    public static int maxValue(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maximum = maxValue(arr);
        System.out.println(maximum);

    }
}
