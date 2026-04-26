package trees.bst;

import trees.MaxPathSum;

public class ValidateBST {
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
        class Triplet{
            public boolean isBst;
            private long min;
            private long max;
            public Triplet(){
                isBst = true;
                min = Long.MAX_VALUE;
                max = Long.MIN_VALUE;
            }
            public Triplet(boolean isBst, long min, long  max){
                this.isBst = isBst;
                this.min = min;
                this.max = max;
            }
        }
        private Triplet dfs(TreeNode root){
            if(root==null){
                return new Triplet();
            }
            Triplet lst = dfs(root.left);
            Triplet rst = dfs(root.right);
            long min = Math.min(root.val, lst.min);
            long max = Math.max(root.val,  rst.max);
            boolean isBst = lst.isBst && rst.isBst  && (root.val>lst.max && root.val<rst.min);
            return new Triplet(isBst, min, max);
        }
        public boolean isValidBST(TreeNode root) {
            return dfs(root).isBst;
        }
    }
}
