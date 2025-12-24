class MyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    public MyLinkedList() {
        head = null;

    }

    public int get(int position) {
        if (head == null)
            return -1;

        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (count == position) {
                return curr.data;
            } else {
                count++;
                curr = curr.next;
            }
        }
        return -1;

    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

    }

    public void addAtTail(int val) {

        Node curr = head;
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        while (curr.next != null) {
            curr = curr.next;

        }

        curr.next = newNode;
        

    }

    public void addAtIndex(int pos, int val) {
        Node newNode = new Node(val);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if(curr == null) return;

        newNode.next = curr.next;
        curr.next = newNode;

    }

    public void deleteAtIndex(int pos) {

        if(head == null) return ;

        if(pos == 0){
            Node temp =  head;
            head = temp.next;
            return;
        }

        Node curr = head;
        
        for(int i =0; i < pos-1 && curr.next != null ; i++){
            curr = curr.next;
        }

        if(curr.next != null){
            curr.next = curr.next.next;
        }



    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */