package linkedlist;

protected class Node {
    int n;
    Node next;

    Node (int value, Node next) {
        this.n = value;
        this.next = next;
    }
}

class LinkedListQues8 {

    //1->2->3->4->5
    //1->2->3->4->5->6
    public boolean isListSizeOdd(Node head) {
        var ptr = head;
        while (ptr != null && ptr.next != null) {
            ptr = ptr.next.next;
        }
        if (ptr == null) return false;
        else return true;
    }
}