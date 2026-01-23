package kadanesandsubarrays;

public class SubArrays {

    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        int n=arr.length;

        for(int i=0;i<n;i++){ // n
            for(int j=i;j<n;j++){ // n
                int k = i;
                // k=0,k=n-1
                while(k<=j){ // n
                    System.out.print(arr[k]+", ");
                    k++;
                }
                System.out.println();
            }
        }
        // n*n*n => TC => O(n3)
        //

    }

}
