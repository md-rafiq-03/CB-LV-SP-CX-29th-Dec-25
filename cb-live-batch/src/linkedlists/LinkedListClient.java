package linkedlists;

public class LinkedListClient {
    public static void main(String[] args)  {

        try {
            LinkedList linkedList = new LinkedList();
            linkedList.addAtFront(10);//2
            linkedList.addAtFront(20); // 1
            linkedList.addAtFront(30); // 0
            linkedList.addAtLast(40);// 3
            linkedList.addAtIndex(2, 100);

            linkedList.print();
            System.out.println(linkedList.getFirst());
            System.out.println(linkedList.getLast());
            System.out.println(linkedList.getAtIndex(4));
            try {
                System.out.println(linkedList.getAtIndex(6));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Remove....");
            System.out.println(linkedList.removeFirst());
            System.out.println(linkedList.removeLast());
            linkedList.print();
            System.out.println(linkedList.removeAtIndex(1));

            linkedList.print();

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
