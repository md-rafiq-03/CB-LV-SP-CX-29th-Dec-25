package linkedlists;

import java.util.List;

public class MiddleOfLinkedList {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        private int getLen(ListNode head){
//            ListNode temp = head;
//            int len=0;
//            while(temp!=null){
//                len++;
//                temp = temp.next;
//            }
//            return len;
            if(head==null) return 0;
            return 1 + getLen(head.next);
        }

        private ListNode getNodeAtK(ListNode head, int k){
            ListNode temp = head;
            for(int i=0;i < k;i++){
                temp = temp.next;
            }
            return temp;
        }

        public ListNode middleNode(ListNode head) {
//            int len = getLen(head);
//            int mid = len/2;
//            return getNodeAtK(head, mid);

            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null &&  fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

}
