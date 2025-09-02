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
    public static ListNode ReverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = null;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;

        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode secondHalf = ReverseList(slow);
        ListNode  firstHalf = head;

        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }
            firstHalf= firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;

        
    }
}