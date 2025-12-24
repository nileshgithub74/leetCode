
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
          if (head == null || head.next == null || k == 0) return head;
        ListNode temp  = head;
        int len =1;

        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        // make it circular

        temp.next = head;

        k = k %len;
         if (k == 0) {
            temp.next = null; // break circular link
            return head;
        }
        int    startHead = len-k;
        ListNode curr  = head;
        for(int i =1; i < startHead; i++){
            curr = curr.next;

        }
        ListNode newNode = curr.next;
        curr.next = null;

        return newNode;



        
    }
}