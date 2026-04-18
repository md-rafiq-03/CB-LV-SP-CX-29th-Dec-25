package trees;

import com.sun.source.tree.Tree;

public class SymmetricTree {
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
         private boolean isSymmetric(TreeNode root1, TreeNode root2){
             if(root1==null && root2==null)
                 return true;

             if(root1==null || root2==null)
                 return false;

             if(root1.val != root2.val)
                 return false;

                return isSymmetric(root1.left, root2.right)
                        && isSymmetric(root1.right, root2.left);
         }
        public boolean isSymmetric(TreeNode root) {
            TreeNode root1 = root.left;
            TreeNode root2 = root.right;
            return isSymmetric(root1, root2);
        }
    }
}
