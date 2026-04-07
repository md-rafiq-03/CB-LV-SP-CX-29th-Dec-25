package linkedlists;

public class LinkedListNoob {

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        node1.next = node2;

        System.out.println("data: "+ node1.data + " next : "+node1.next);
        System.out.println("data: "+ (node1.next).data + " next : "+node1.next.next);
    }

}
