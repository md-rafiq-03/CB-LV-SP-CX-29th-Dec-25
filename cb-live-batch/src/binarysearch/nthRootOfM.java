package binarysearch;

public class nthRootOfM {
    // m^(1/n)
    public static int nthPower(int x, int n){
        int power = 1;
        for(int i=0;i<n;i++){
            power*=x;
        }
        return power;
    }
    public static void main(String[] args) {
        int m = 81;
        int n = 4;
        int lo = 0, hi = m;
        int ans = -1;

        // TC = O(logm * n) = (n*logm)
        // SC =O(1)
        while(lo<=hi){ // n* logm
            int mid = lo+(hi-lo)/2;
            if(nthPower(mid,n)==m){
                ans = mid;
                break;
            }else if(nthPower(mid,n)>m){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        System.out.println(ans);
    }

}
