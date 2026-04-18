package trees;

public class SumRootToLeaf {
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
         private int sumNumbers(TreeNode root, int num){
             if(root==null)
                 return 0;
            if(root.left == null && root.right==null){
                return num;
            }

            int ls = sumNumbers(root.left, num*10+root.val);
            int rs = sumNumbers(root.right, num*10+root.val);

            return ls + rs;
         }
        public int sumNumbers(TreeNode root) {
            return sumNumbers(root, 0);
        }
    }
}
