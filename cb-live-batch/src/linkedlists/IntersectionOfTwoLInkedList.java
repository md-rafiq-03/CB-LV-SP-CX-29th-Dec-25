package linkedlists;

import java.util.List;

public class IntersectionOfTwoLInkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        private int getLen(ListNode head){
           return head==null? 0: 1 + getLen(head.next);
        }

        private void initialStart(ListNode head, int diff){
            while(diff-->0){
                head = head.next;
            }
        }


        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int len1 = getLen(headA);
            int len2 = getLen(headB);
            System.out.println(len1 + ", " + len2);
            if(len1>len2){
                initialStart(headA, len1-len2);
            }else{
                initialStart(headB, len2-len1);
            }

            while(headA!=headB){
                headA=headA.next;
                headB = headB.next;
            }

            return headA;
        }
    }

}
