package trees;

import java.util.*;

public class VerticalOrderTraversal {
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
        Map<Integer, Map<Integer,List<Integer>>> map;
        private void dfs(TreeNode root, int row, int col){
            if(root==null){
                return;
            }

            map.computeIfAbsent(col, k -> new TreeMap<>())
                    .computeIfAbsent(row, k -> new ArrayList<>())
                    .add(root.val);

            dfs(root.left, row+1, col-1);
            dfs(root.right, row+1, col+1);
        }
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            map = new TreeMap<>();
            dfs(root, 0,0);
            List<List<Integer>> result = new ArrayList<>();
            for (Map.Entry<Integer, Map<Integer, List<Integer>>> entry : map.entrySet()) {
                Integer outerKey = entry.getKey();
                Map<Integer, List<Integer>> innerMap = entry.getValue();
                List<Integer> temp = new ArrayList<>();
                for (Map.Entry<Integer, List<Integer>> innerEntry : innerMap.entrySet()) {
                    List<Integer> values = innerEntry.getValue();
                    Collections.sort(values);
                    temp.addAll(values);
                }
                result.add(temp);
            }

            return result;
        }
    }
}
