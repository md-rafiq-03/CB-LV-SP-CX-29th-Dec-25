package kadanesandsubarrays;

public class KadanesAlgo {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<n;i++){
            currSum +=nums[i];
            maxSum= Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        System.out.println(maxSubArray(arr));
    }
}
