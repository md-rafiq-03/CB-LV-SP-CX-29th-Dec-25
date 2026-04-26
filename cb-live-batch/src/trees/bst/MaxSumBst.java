package trees.bst;

public class MaxSumBst {
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
            private long sum;
            private long maxSum;

            public Triplet(){
                isBst = true;
                min = Long.MAX_VALUE;
                max = Long.MIN_VALUE;
                sum = 0;
                maxSum = Long.MIN_VALUE;

            }
            public Triplet(boolean isBst, long min, long  max, long sum, long maxSumx){
                this.isBst = isBst;
                this.min = min;
                this.max = max;
                this.maxSum = maxSumx;
                this.sum = sum;
            }
        }
        private Solution.Triplet dfs(TreeNode root){
            if(root==null){
                return new Solution.Triplet();
            }
            Triplet lst = dfs(root.left);
            Triplet rst = dfs(root.right);
            long min = Math.min(root.val, lst.min);
            long max = Math.max(root.val,  rst.max);
            long sum = lst.sum + rst.sum + root.val;
            boolean isBst = lst.isBst && rst.isBst  && (root.val>lst.max && root.val<rst.min);
            Triplet triplet ;
            if(isBst){
                long maxSum = Math.max(lst.maxSum, Math.max(rst.maxSum, lst.sum + rst.sum + root.val));
                triplet =  new Triplet(isBst, min, max, sum, maxSum);
            } else {
                triplet = new Triplet(isBst, min, max, sum, Math.max(lst.maxSum, rst.maxSum));
            }
            return triplet;
        }
        public int maxSumBST(TreeNode root) {
            return (int)dfs(root).maxSum;
        }
    }
}
