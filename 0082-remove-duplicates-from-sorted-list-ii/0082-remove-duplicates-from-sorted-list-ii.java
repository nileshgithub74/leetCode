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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummyNode = new ListNode(0);
        ListNode prev = dummyNode;
        dummyNode.next = head;
        ListNode curr = head;

        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
      
      return dummyNode.next;
       

       

    }
}