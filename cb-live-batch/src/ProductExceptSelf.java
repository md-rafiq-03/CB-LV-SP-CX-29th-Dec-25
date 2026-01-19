public class ProductExceptSelf {
    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int[]  nums = {2,3,4,5,3};
        int n = nums.length;

        int[] lp = new int[n];
        int[] rp = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                lp[i]=nums[i];
            }else{
                lp[i] = nums[i] * lp[i-1];
            }
        }
        for(int i = n-1;i>=0;i--){
            if(i==n-1){
                rp[i] = nums[i];
            }else{
                rp[i] = nums[i] * rp[i+1];
            }
        }
        int[] ans = new int[n]; // output -> not included in space
        for(int i =0;i<n;i++){
            // i = 0 and i==n-1
            // i-1=0-1=-1
            // i+1 = n-1+1 = n
            if(i==0){
                ans[i] = rp[i+1];
            }else if(i==n-1){
                ans[i] = lp[i-1];
            }else {
                ans[i] = lp[i - 1] * rp[i + 1];
            }
        }
        // TC = N+N+N = 3*N = O(N)
        // SC = N + N = 2*N = O(N)
//        print(nums);
//        print(lp);
//        print(rp);
        print(ans);

    }
}
