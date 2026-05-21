package mapandset;

import java.util.HashMap;
import java.util.Map;

public class BadPairs {
    class Solution {
        public long countBadPairs(int[] nums) {
            int n = nums.length;
            int[] diffArr = new int[n];
            Map<Integer, Long> map = new HashMap<>();
            for(int i=0;i<n;i++){
                diffArr[i] = nums[i]-i;
                map.put(diffArr[i], map.getOrDefault(diffArr[i], 0L) + 1);
            }
            long goodPairs = 0;
            for(long count : map.values()){
                goodPairs += count*(count-1)/2;
            }

            return (long)n*(n-1)/2 - goodPairs;
        }
    }
}
