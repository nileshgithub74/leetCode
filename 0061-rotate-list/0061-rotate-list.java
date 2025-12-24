
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp  = head;
        int len =1;

        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        // make it circular

        temp.next = head;

        k = k %len;
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