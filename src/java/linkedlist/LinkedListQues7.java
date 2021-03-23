package linkedlist;

protected class Node {
    int n;
    Node next;

    Node (int value, Node next) {
        this.n = value;
        this.next = next;
    }
}

class LinkedListQues7 {

    public void displayFromEnd(Node head) {
        if (head == null) return;
        displayFromEnd(head.next);
        print(head.n);
    }
}