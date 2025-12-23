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
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode ptr = dummyNode;

        while (ptr.next != null && ptr.next.next != null) {
            ListNode swap1 = ptr.next;
            ListNode swap2 = ptr.next.next;
            // new node formations

            swap1.next = swap2.next;
            swap2.next = swap1;

            // move the pointer

            ptr.next = swap2;
            ptr = swap1;

        }

        return dummyNode.next;

    }
}