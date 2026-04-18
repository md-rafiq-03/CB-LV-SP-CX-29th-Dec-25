package trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTrees {
    private Node root;
    Scanner sc = new Scanner(System.in);

    public Node createTree(){
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        Node root = new Node(data);

        System.out.println("Has Left Child: ");
        boolean hasLeftChild = sc.nextBoolean();
        if(hasLeftChild){
            Node leftChild = createTree();
            root.left = leftChild;
        }
        System.out.println("Has Right Child: ");
        boolean hasRightChild = sc.nextBoolean();
        if(hasRightChild){
            Node rightChild = createTree();
            root.right = rightChild;
        }
        return root;
    }

    public void preOrder(Node root){
        if(root==null) return ;
        System.out.print(root.data +", ");
        preOrder(root.left); // lst
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root==null) return ;
        inOrder(root.left);//lst
        System.out.print(root.data +", ");
        inOrder(root.right);//rst
    }

    public int findMax(Node root){
        if(root==null)
            return Integer.MIN_VALUE;

        int lmax = findMax(root.left);
        int rmax= findMax(root.right);
        // calculation
        return Math.max(root.data, Math.max(lmax, rmax));
    }

    public void levelOrder(Node root){
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

    public boolean findElementInBT(Node root, int element){
        if(root==null)
            return false;
        if(root.data==element)
            return true;
        return findElementInBT(root.left, element)
                || findElementInBT(root.right, element);
    }

}
