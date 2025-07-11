class MyHashMap {
    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int max = 1000;
    Node[] hash;

    public MyHashMap() {
        hash = new Node[max];
    }

    private int getHash(int key) {
        return Integer.hashCode(key) % max;
    }

 
    private Node find(Node head, int key) {
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    public void put(int key, int value) {
        int index = getHash(key);
        if (hash[index] == null) {
            hash[index] = new Node(-1, -1); 
        }
        Node prev = find(hash[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int index = getHash(key);
        if (hash[index] == null) return -1;
        Node prev = find(hash[index], key);
        if (prev.next == null) return -1;
        return prev.next.value;
    }

    public void remove(int key) {

        int index =  getHash(key);
        if(hash[index] == null) return ;
        Node  curr = find(hash[index], key);
        if(curr.next == null) return;
        curr.next = curr.next.next;
       
    }
}
