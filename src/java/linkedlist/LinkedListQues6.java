package linkedlist;

protected class Node {
    int n;
    Node next;

    Node (int value, Node next) {
        this.n = value;
        this.next = next;
    }
}

class LinkedListQues6 {

    public Node getMiddleOfList(Node head) {
        if (head == null || head.next == null) return head;
        var ptr1 = head;
        var ptr2 = head.next;
        while (ptr1 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            if (ptr2.next != null) ptr2 = ptr2.next;
        }
        return ptr1.next;
    }
}