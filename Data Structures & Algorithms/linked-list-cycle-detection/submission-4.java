/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode curr = head;
        ListNode curr2 = head.next;

        while(curr != null || curr2 != null){
            if(curr == curr2) return true;

            curr = curr.next;
            if(curr2 == null || curr2.next == null) return false;
            curr2 = curr2.next.next;
        }

        return false;
    }
}
