package recursion;

import java.util.ArrayList;
import java.util.List;

public class UnboundedKnapSack {
    private static void solve(int[] coins , int sum, int i, StringBuilder sb){
        // base cases
        //System.out.println(sum + ", " + sb);
        int n = coins.length;

        if(sum==0) {
            // System.out.println("Ok");
            System.out.println(sb);
            return ;
        }

        if(i>=n || sum<0)
            return ;


        // take
        sb.append(coins[i]);
        solve(coins, sum-coins[i], i, sb);
        sb.deleteCharAt(sb.length()-1);


        // not take
        solve(coins, sum, i+1, sb);
    }

    public static void main(String[] args) {
        int[] coins = {1,4,2};
        int sum = 6;
        StringBuilder sb = new StringBuilder("");
        solve(coins, sum, 0, sb);
    }
}
