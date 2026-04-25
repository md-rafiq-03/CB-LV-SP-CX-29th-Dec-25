package trees;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class MaxPathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public int dfs(TreeNode root, int ans){
            if(root==null)
                return -1_000_000;

            int lmax = dfs(root.left, ans);
            int rmax = dfs(root.right, ans);
            // calc
            List<Integer> temp = List.of(root.val, root.val+lmax, root.val+rmax, root.val + lmax + rmax);
            ans  = Math.max(ans, Collections.max(temp));

            return Collections.max(List.of(root.val, root.val + lmax, root.val + rmax));
        }
        public int maxPathSum(TreeNode root) {
            int ans = 0;
            dfs(root, ans);
            return ans;
        }
    }
}

