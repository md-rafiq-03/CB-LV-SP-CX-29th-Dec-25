package mapandset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntersectionII {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            int n1 = nums1.length;
            for(int i=0;i<n1;i++){
                map.put(nums1[i], map.getOrDefault(nums1[i], 0) +1);
            }
            int n2 = nums2.length;
            List<Integer> ans = new ArrayList<>();
            int pos = 0;
            for(int i=0;i< n2;i++){
                if(map.containsKey(nums2[i]) && map.get(nums2[i])>0 ){
                    ans.add(nums2[i]);
                    map.put(nums2[i], map.getOrDefault(nums1[i], 0)-1);
                }
            }
            return ans.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
