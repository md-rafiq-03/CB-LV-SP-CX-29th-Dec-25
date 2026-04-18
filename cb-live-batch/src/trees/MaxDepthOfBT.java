package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MaxDepthOfBT {
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
        public int maxDepth(TreeNode root) {
            if(root==null)
                return 0;
            int lh = maxDepth(root.left);
            int rh = maxDepth(root.right);
            int currHeight = 1 + Math.max(lh, rh);
            return currHeight;
        }
    }
}
