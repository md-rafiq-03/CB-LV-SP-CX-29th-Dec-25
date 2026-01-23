package kadanesandsubarrays;

public class SumOfAllSubArrays {

//    public int maxSubArray(int[] nums) {
//        // input kaise le
//    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int maxSum = Integer.MIN_VALUE;
        //int maxSum = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
//                int k = i;
//                int sum  =0;
//                while(k<=j){
//                    sum+=arr[k];
//                    k++;
//                }
                sum+=arr[j];
                maxSum = Math.max(sum, maxSum);
                System.out.println(sum);
            }
        }
        System.out.println("maxSum: "+maxSum);
        // TC =n*n = O(n2)

    }
}
