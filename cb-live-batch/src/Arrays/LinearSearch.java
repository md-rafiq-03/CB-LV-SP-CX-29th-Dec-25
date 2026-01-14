package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int item){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // how to take input in array
        // intput = {2,3,6,5,7,9}
        // item = 3;
        // output = 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter item : ");
        int item = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n;i++){
//            int element = sc.nextInt();
//            arr[i] = element;
            arr[i] = sc.nextInt();
        }

        int indexOfItem = linearSearch(arr, item);
        System.out.println(indexOfItem);
    }
}
