package trees;

import java.util.*;

public class BTLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new ArrayDeque<>();
            List<List<Integer>> list = new ArrayList<>();
            if(root==null)
                return list;
            q.offer(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> temp = new ArrayList<>();
                while(size-->0) {
                    TreeNode node = q.poll();
                    temp.add(node.val);
                    if (node.left != null) {
                        q.offer(node.left);
                    }

                    if (node.right != null) {
                        q.offer(node.right);
                    }
                }
                list.add(temp);
            }
            return list;
        }
    }
}
