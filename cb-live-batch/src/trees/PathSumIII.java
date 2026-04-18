package trees;

import java.util.ArrayList;
import java.util.List;

public class PathSumIII {
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
        private static int count = 0;
        private static int lcount = 0;
        public void dfs2(TreeNode root, long pathSum){
            if(root==null) {
                return;
            }
            if(pathSum-root.val==0){
                count++;
                lcount++;
            }

            dfs2(root.left, pathSum-root.val);
            dfs2(root.right, pathSum-root.val);
        }
        public void dfs1(TreeNode root, int targetSum){
            if(root==null){
                return;
            }
            lcount=0;

            dfs2(root, targetSum);
            dfs1(root.left, targetSum);
            dfs1(root.right, targetSum);
        }
        public int pathSum(TreeNode root, int targetSum) {
            count = 0;
            if(root==null) return 0;
            dfs1(root, targetSum);
            return count;
        }
    }
}
