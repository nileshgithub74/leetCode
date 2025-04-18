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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode curr = head;
        while(curr != null){
             count++;
             curr = curr.next;
        }

         if (n == count) {
            return head.next;
        }

        int  len = count -n+1;

        curr = head;
        for(int i = 0; i<len-2; i++){
            curr = curr.next;
        }

        curr.next =curr.next.next;

        return  head;
        
    }
}