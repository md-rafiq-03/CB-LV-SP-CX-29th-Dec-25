package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromPartitioning {

    private static void solve(String s, int i,int j, List<String> list,
                              List<List<String>> ans){
        // base case
        if(i>j){
            //System.out.println("ok");
            ans.add(new ArrayList<>(list));
            //System.out.println(ans);
            return;
        }
        StringBuilder sb = new StringBuilder("");
        for(int k=i;k<=j;k++){
            sb.append(s.charAt(k));
            if(isPal(sb)){
                list.add(new String(sb.toString()));
                // System.out.println(list);
                solve(s , k+1, j, list, ans);
                list.remove(list.size()-1);
            }
        }

    }
    private static boolean isPal(StringBuilder sb){
        int i=0,j=sb.length()-1;
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(s, 0, s.length()-1, new ArrayList<>(),ans);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s = "cbbbcc";
        System.out.println(partition(s));
    }

}
