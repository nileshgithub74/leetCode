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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode leftprevNode = dummyNode;
        ListNode curr = head;

        for(int i =0; i< left - 1; i++){
            leftprevNode = leftprevNode.next;
            curr = curr.next;
        }

        ListNode startNode = curr;

        ListNode prev = null;

        for(int i =0; i<right-left + 1; i++){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;

        }

        leftprevNode.next = prev;
        startNode.next = curr;



        return dummyNode.next;
    }

}