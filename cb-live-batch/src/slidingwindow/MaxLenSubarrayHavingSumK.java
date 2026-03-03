package slidingwindow;

public class MaxLenSubarrayHavingSumK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,4,5,3};
        int k = 9;
        int n = arr.length;
        int i=0,j=0;
        int sum=0;
        int len =0;
        while(j<n){
            sum+=arr[j];
            // window size is greater than k
            if(sum>k){
                while(sum>k && i<j){
                    sum-=arr[i];
                    i++;
                }
            }
            //window == k
            if(sum==k){
                len=Math.max(len, j-i+1);
            }
           j++;// window expand
        }
        System.out.println(len);
    }
}
