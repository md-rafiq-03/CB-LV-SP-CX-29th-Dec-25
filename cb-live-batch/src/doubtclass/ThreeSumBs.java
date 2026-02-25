package doubtclass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumBs {
    public static int BS(int[] arr, int target,int lo, int hi){
        //System.out.println(lo+", "+hi);
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] arr = new int[]{1,1,2,1,2,2,3,3};
        int target = 6;
        Arrays.sort(arr);
//        for(int e:arr){
//            System.out.print(e+", ");
//        }
        //System.out.println();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-2;i++){ // n
            if(i>0 && arr[i]==arr[i-1])
                continue;
            for(int j=i+1;j<n-1;j++){ // n
                // duplicate
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int first = arr[i];
                int second = arr[j];
                int thirdElementIdx = BS(arr,target-(first+second),j+1,n-1); // logn
                if(thirdElementIdx!=-1 && first+second+arr[thirdElementIdx]==target){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(first);
                    list.add(second);
                    list.add(arr[thirdElementIdx]);
                    ans.add(list);
                }
            }
        }
        // TC = n*n*logn

        for(List<Integer> list : ans){
            System.out.println(list.get(0) +", " + list.get(1) +" and "+ list.get(2));
        }

    }
}
