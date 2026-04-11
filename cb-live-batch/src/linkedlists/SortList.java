package linkedlists;

public class SortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        private ListNode mergeTwoLists(ListNode h1, ListNode h2) {
            ListNode dummy = new ListNode();
            ListNode temp = dummy;

            while(h1!=null && h2!=null){
                if(h1.val<h2.val){
                    temp.next = h1;
                    h1 = h1.next;
                    temp = temp.next;
                }else{
                    temp.next = h2;
                    h2 = h2.next;
                    temp = temp.next;
                }
            }

            if(h1==null){
                temp.next = h2;
            }else if(h2==null){
                temp.next = h1;
            }

            return dummy.next;
        }

        public ListNode getMiddleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next!=null &&  fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        private ListNode mergeSort(ListNode head){
            // base
            if(head==null || head.next==null){
                return head;
            }
            ListNode middleNode = getMiddleNode(head);
            ListNode rightNode = middleNode.next;
            ListNode leftNode = head;
            middleNode.next = null;

            ListNode left = mergeSort(leftNode);
            ListNode right = mergeSort(rightNode);
            return mergeTwoLists(left, right);
        }


        public ListNode sortList(ListNode head) {
            return mergeSort(head);
        }
    }

}
