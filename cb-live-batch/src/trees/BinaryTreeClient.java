package trees;

public class BinaryTreeClient {
    public static void main(String[] args) {
//        Node root = new Node(10);
//        Node leftChild = new Node(20);
//        Node rightChild = new Node(30);
//
//        root.left = leftChild;
//        root.right = rightChild;
//
//        System.out.println("root: " + root.data);
//        System.out.println("left: "+ root.left.data);
//        System.out.println("right: " + root.right.data);
//        System.out.println(root.left.left);
//        System.out.println(root.left.right);
//        System.out.println(root.right.left);
//        System.out.println(root.right.right);

        BinaryTrees binaryTrees = new BinaryTrees();
        Node root = binaryTrees.createTree();

        binaryTrees.preOrder(root);
        System.out.println();
        binaryTrees.inOrder(root);
    }
}
