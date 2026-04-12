package linkedlists;

public class LinkedListCycleII {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head==null || head.next==null){
                return null;
            }
            ListNode slow = head.next;
            ListNode fast = head.next.next;

            while(slow!=fast){
                if(slow==null || fast==null || fast.next==null)
                    return null;
                slow = slow.next;
                fast = fast.next.next;
            }

            while(head!=slow){
                head = head.next;
                slow = slow.next;
            }

            return head;

        }
    }

}
