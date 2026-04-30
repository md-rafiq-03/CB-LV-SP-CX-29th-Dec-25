package trees;

public class BalanceBSTFromSortedArray {
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
        private TreeNode createTree(int[] nums , int lo, int hi){
            // base case
            // no of element = 0
            if(lo>hi){
                return null;
            }

            int mid = lo+(hi-lo)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = createTree(nums, lo, mid-1);
            root.right = createTree(nums , mid+1 , hi);

            return  root;
        }
        public TreeNode sortedArrayToBST(int[] nums) {
            return createTree(nums, 0, nums.length-1);
        }
    }
}
