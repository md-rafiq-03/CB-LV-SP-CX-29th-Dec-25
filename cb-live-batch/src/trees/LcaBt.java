package trees;

import java.util.ArrayList;
import java.util.List;

public class LcaBt {

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
//        private boolean dfs(TreeNode root, TreeNode node, List<TreeNode> list){
//            if(root==null)
//                return false;
//            if(root==node){
//                // store
//                return true;
//            }
//            list.add(root);
//            if(dfs(root.left, node, list)) return true;
//            if(dfs(root.right, node, list)) return true;
//            list.remove(list.size()-1);
//            return false;
//        }

        private TreeNode findLca(TreeNode root, TreeNode p, TreeNode q){
            if(root==null){
                return null;
            }
            if(root==p || root==q){
                return root;
            }
            TreeNode l = findLca(root.left, p, q);
            TreeNode r = findLca(root.right, p, q);
            if(l!=null && r!=null){
                return root;
            }
            else if(l!=null){
                return l;
            }

            return r;
        }

 //       public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            List<TreeNode> path1  = new ArrayList<>();
//            List<TreeNode> path2 = new ArrayList<>();
//            dfs(root, p, path1);
//            dfs(root, q, path2);
//            System.out.println(path1);
//            System.out.println(path2);
//            for(TreeNode node : path1){
//                System.out.println(node.val);
//            }
  //      }
    }
    
}
