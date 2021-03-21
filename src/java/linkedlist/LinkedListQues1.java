package linkedlist;

class Node {
    int n;
    Node next;

    Node (int value, Node next) {
        this.n = value;
        this.next = next;
    }
}

public class LinkedListQues1 {
    private Node head;

    public int getNthElementFromEnd(int position) {
        var pTemp = head;
        var pNthTemp = head;
        while (position > 0 && pNthTemp != null) {
            pNthTemp = pNthTemp.next;
            position--;
        }
        while (pNthTemp != null) {
            pTemp = pTemp.next;
            pNthTemp = pNthTemp.next;
        }
        if (pTemp != null) return pTemp.n else return -1;
    }
}

