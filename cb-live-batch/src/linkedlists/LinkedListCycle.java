package linkedlists;

public class LinkedListCycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public boolean hasCycle(ListNode head) {
            if(head==null || head.next==null){
                return false;
            }
            ListNode slow = head.next;
            ListNode fast = head.next.next;

            while(slow!=fast){
                if(slow==null || fast==null || fast.next==null)
                    return false;
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }

}
