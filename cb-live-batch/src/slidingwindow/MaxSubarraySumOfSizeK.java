package slidingwindow;

public class MaxSubarraySumOfSizeK {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n = arr.length;
        int i=0,j=0;
        int sum=0;
        int ans=0;
        while(j<n){
            sum+=arr[j];
            //window size is greater than k
            if(j-i+1>k){
                sum-=arr[i];
                i++;
            }
            // window size is equal to k
            if(j-i+1==k){
                ans=Math.max(ans, sum);
            }
            j++;
        }
        System.out.println(ans);
    }
}
