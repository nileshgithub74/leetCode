
class Solution {


      public ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode next = null;
            ListNode curr = head;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr =  next;
            }
            return prev;
        }
    public boolean isPalindrome(ListNode head) {

      




        ListNode slow = head;
        ListNode fast   = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;
        while(secondHalf != null){
            if(firstHalf.val  != secondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;

        
    

 
        
    }
}