package trees.bst;

import trees.Node;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTreeImpl {
    public Node root;
    Scanner sc;

    BinarySearchTreeImpl(){
        root = null;
        sc = new Scanner(System.in);
    }

    private Node insertIntoBST(Node root, int data){
        if(root==null){
            return new Node(data);
        }

        if(root.data > data){
            root.left =  insertIntoBST(root.left, data);
        } else {
            root.right = insertIntoBST(root.right, data);
        }
        return  root;
    }
    // create a BST
    public void createBST(){
        while(true){
            int data = sc.nextInt();
            if (data == -1) {
                break;
            }
            root = insertIntoBST(root, data);
        }
    }

    public boolean search(Node root, int element){
        if(root==null)
            return false;
        if(root.data==element)
            return true;

        if(root.data>element){
            return search(root.left, element);
        }else{
            return search(root.right, element);
        }
    }

    public Node deleteNode(Node root, int val){
        if(root==null){
            return null;
        }

        if(root.data>val){
            root.left = deleteNode(root.left, val);
        } else if(root.data<val){
            root.right = deleteNode(root.right, val);
        } else{
            // IF FOUND -> DELETE
            // CASE -1
            if(root.left==null && root.right==null){
                return null;
            }
            //CASE-2
            if(root.left!=null && root.right==null) return root.left;
            if(root.left==null && root.right!=null) return root.right;

            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, minNode.data);
        }
        return root;
    }

    private Node findMin(Node root){
        while(root!=null){
            root=root.left;
        }
        return root;
    }

    public int getMin(Node root){
        Node temp = root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
    }

    public int getMax(Node root){
        Node temp = root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.data;
    }


    // postOrder, preOrder
    public void inOrder(Node root){
        if(root==null) return ;
        inOrder(root.left);//lst
        System.out.print(root.data +", ");
        inOrder(root.right);//rst
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


}
