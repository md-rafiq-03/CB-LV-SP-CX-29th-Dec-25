package trees;

import java.util.ArrayList;
import java.util.List;

public class RightViewOfBt {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }


    class Solution {
        private void dfs(Node root,ArrayList<Integer> list, int depth){
            if(root==null)
                return ;
            if(depth==list.size()){
                list.add(root.data);
            }
            dfs(root.left, list, depth+1);
            dfs(root.right, list, depth+1);
        }
        public ArrayList<Integer> leftView(Node root) {
            ArrayList<Integer> list = new ArrayList<>();
            dfs(root, list, 0);
            return list;
        }
    }
}
