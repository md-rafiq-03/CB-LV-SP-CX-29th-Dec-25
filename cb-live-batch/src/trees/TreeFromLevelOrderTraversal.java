package trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TreeFromLevelOrderTraversal {
    private Scanner sc;
    public Node root;
    public TreeFromLevelOrderTraversal(){
        root = null;
        sc = new Scanner(System.in);
    }

    public void createTree(){
        System.out.println("Enter root data: ");
        int data = sc.nextInt();
        Node root = new Node(data);
        this.root = root;
        //Queue<Node> queue = new LinkedList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.println("Enter left child data of " + curr.data + ": ");
            int leftChildData = sc.nextInt();
            if(leftChildData!=-1){
                Node leftChild = new Node(leftChildData);
                curr.left = leftChild;
                q.add(leftChild);
            }
            System.out.println("Enter right child data of " + curr.data + ": " );
            int rightChildData = sc.nextInt();
            if(rightChildData!=-1){
                Node rightChild = new Node(rightChildData);
                curr.right = rightChild;
                q.add(rightChild);
            }
        }
    }

    public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node root){
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0) {
                Node node = q.poll();
                System.out.print(node.data + ", ");
                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
    }

}
