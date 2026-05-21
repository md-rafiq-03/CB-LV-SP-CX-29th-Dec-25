package mapandset;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubs {
    class Solution {
        public int longestConsecutive(int[] nums) {
            int n = nums.length;
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(nums[i]);
            }
            int ans  = 0;
            for(int e : set ){
                if(!set.contains(e-1)){
                    int len = 1;
                    int start = e;
                    while(set.contains(start+1)){
                        len++;
                       // set.remove(start); // O(1)
                        start++;
                    }
                    ans = Math.max(ans, len);
                }
            }
            return ans;
        }

    }
}
