package trees;

public class DimeterOfBT {
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
          class Pair{
             public int height;
             public int diameter;

             public Pair(int height, int diameter){
                 this.height = height;
                 this.diameter = diameter;
             }
         }

         private Pair dfs(TreeNode root){
             if(root==null){
                 return new Pair(0, 0);
             }
             Pair lst  = dfs(root.left);
             Pair rst = dfs(root.right);
             int currentNodeDia = lst.height + rst.height;
             int diameter = Math.max(currentNodeDia, Math.max(lst.diameter, rst.diameter));
             int height = Math.max(lst.height, rst.height) + 1;

            return new Pair(height, diameter);
         }
        public int diameterOfBinaryTree(TreeNode root) {
              if(root==null)
                  return 0;
              return dfs(root).diameter;
        }
    }
}
