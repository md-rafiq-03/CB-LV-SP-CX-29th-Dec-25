package binarysearch;

public class SingleElement {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;

        int lo = 0, hi = n-1;

        //.. mid -1 , mid , mid+1
        // mid = 0 , mid =-1
        int ans = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int prev = (mid-1+n)%n;
            int next = (mid+1)%n; // mid = n-1+1=>n

            if(arr[mid]!=arr[prev] && arr[mid]!=arr[next]){
                ans= arr[mid];
                break;
            }else if(arr[mid] == arr[next]){
                int len = (hi-mid+1);
                if(len%2==0){
                    hi=mid-1;
                }else {
                    lo = mid + 2;
                }
            }else if(arr[mid]==arr[prev]){
                int len = (mid-lo+1);
                if(len%2==0){
                    lo=mid+1;
                }else{
                    hi=mid-2;
                }
            }
        }
        System.out.println(ans);

    }
}
