package linkedlists;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtFront(10);//2
        linkedList.addAtFront(20); // 1
        linkedList.addAtFront(30); // 0
        linkedList.addAtLast(40);// 3
        linkedList.addAtIndex(2, 100);


        linkedList.print();
    }
}
