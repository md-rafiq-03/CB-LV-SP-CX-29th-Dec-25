package doubtclass;

import java.util.ArrayList;

import java.util.Collections;

public class ThreeSum {
    public static boolean isPresent(ArrayList<ArrayList<Integer>> ans,
                                    ArrayList<Integer> temp){
        if(ans.size()==0){
            return false;
        }
        for(ArrayList<Integer> list : ans){
            if(list.get(0)==temp.get(0) &&
                    list.get(1)==temp.get(1) &&
                    list.get(2)==temp.get(2)){
                return true;
            };
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] arr ={1,1,2,2,2,6,7,7};
        int target = 10;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        if(!isPresent(ans, temp)){
                            ans.add(temp);
                        }
                    }
                }
            }
        }

        for(ArrayList<Integer> list: ans){
            System.out.println(list.get(0) +", " + list.get(1) +" and "+ list.get(2));
        }
    }
}
