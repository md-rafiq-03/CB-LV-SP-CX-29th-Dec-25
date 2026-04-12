package linkedlists;

public class ReverseNodesInKGroup {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private ListNode getLastNode(ListNode temp, int k){
        while(k-->1){
            if(temp==null)
                return null;
            temp = temp.next;
        }
        return temp;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    // 1-->2-->3-->4-->5-->6-->7-->null

    // last = 3-->2-->1 = temp
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode temp = head;
            ListNode prevGroupLastNode = null;
            while(temp!=null){
                ListNode lastNodeOfKthGroup = getLastNode(temp, k);
                if(lastNodeOfKthGroup==null){
                    if(prevGroupLastNode!=null) prevGroupLastNode.next = temp;
                    break;
                }
                ListNode firstNodeInNextGroup = lastNodeOfKthGroup.next;
                lastNodeOfKthGroup.next = null;
                reverseList(temp);
                if(temp==head){
                    head = lastNodeOfKthGroup;
                }else{
                   prevGroupLastNode.next = lastNodeOfKthGroup;
                }
                prevGroupLastNode = temp;
                temp = firstNodeInNextGroup;
            }
            return head;
        }
    }

}
