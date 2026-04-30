package trees;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class BinartTreeFromInorderPreorder {
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
        private int ind = 0;
        private Map<Integer, Integer> map;

        private TreeNode createTree(int[] preorder, int[] inorder, int s, int e){
            if(s>e) return null;
            if(ind==preorder.length) return null;

            int rootData = preorder[ind++];
            TreeNode root = new TreeNode(rootData);
            int pivotIndex = map.get(rootData);

            root.left = createTree(preorder, inorder, s, pivotIndex-1);
            root.right = createTree(preorder, inorder, pivotIndex+1, e);

            return root;
        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            map = new HashMap<>();
            for(int i=0;i<inorder.length;i++){
                map.put(inorder[i], i);
            }

            return createTree(preorder, inorder, 0, preorder.length-1);
        }
    }
}
