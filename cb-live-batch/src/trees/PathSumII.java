package trees;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
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
         List<List<Integer>> result ;
        public void dfs(TreeNode root, int targetSum, List<Integer> list){
            if(root==null){
                return ;
            }

            if(root.left==null && root.right==null){
                if(targetSum-root.val==0) {
                    list.add(root.val);
                    result.add(new ArrayList<>(list));
                    list.remove(list.size()-1);
                }
                return ;
            }

            list.add(root.val);
            dfs(root.left, targetSum-root.val,list);
            dfs(root.right, targetSum- root.val, list);
            list.remove(list.size()-1);
            //list.remove(Integer.valueOf(root.val));
        }
        public  List<List<Integer>> pathSum(TreeNode root, int targetSum){
            result = new ArrayList<>();
            dfs(root, targetSum, new ArrayList<>());
            return result;
        }
    }
}
