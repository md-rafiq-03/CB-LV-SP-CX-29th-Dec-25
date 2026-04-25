package trees;

import java.util.*;

public class WidthOfBT {
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
            TreeNode node;
            int index;

            public Pair(TreeNode node, int index){
                this.node = node;
                this.index = index;
            }
        }

        public int widthOfBinaryTree(TreeNode root) {
            int count = 0;
            Deque<Pair>  q= new ArrayDeque<>();
            q.offer(new Pair(root, 0));
            int len = 0;
            while(!q.isEmpty()){
                int size = q.size();
                int first = q.peekFirst().index;
                int last = q.peekLast().index;
                len = Math.max(len, last-first+1);
                count++;
                while(size-->0){
                    Pair pair = q.poll();
                    TreeNode node = pair.node;
                    int index = pair.index;
                    if(node.left!=null){
                        System.out.println("left side");
                        q.offer(new Pair(node.left, 2*index+1-last));
                    }

                    if(node.right!=null){
                        System.out.println("right side");
                        q.offer(new Pair(node.right, 2*index+1-last));
                    }
                }
            }

            return  len;
        }
    }
}
