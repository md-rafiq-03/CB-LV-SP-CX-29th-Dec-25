package trees;

import java.util.*;

public class TopViewOfBt {
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
        //10 20 30 40 60 90 100
        class Pair{
            Node node;
            int level;

            public Pair(Node node, int level){
                this.node = node;
                this.level = level;

            }
        }
        public void bfs(Node root, Map<Integer, Integer>map){
            Queue<Pair> q = new ArrayDeque<>();
            q.offer(new Pair(root, 0));
            while(!q.isEmpty()){
                int size = q.size();
                while(size-->0) {
                    Pair pair= q.poll();
                    Node node =pair.node;
                    int level = pair.level;
                    if(!map.containsKey(level)){
                        map.put(level, node.data);
                    }
                    if (node.left != null) {
                        q.offer(new Pair(node.left, level-1));
                    }

                    if (node.right != null) {
                        q.offer(new Pair(node.right, level+1));
                    }
                }
            }
        }
        public ArrayList<Integer> topView(Node root) {
            Map<Integer, Integer> map = new TreeMap<>();
            bfs(root, map);
            ArrayList<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                list.add(entry.getValue());
            }
            return list;
        }
    }
}
