package linkedlist;

protected class Node {
    int n;
    Node next;

    Node (int value, Node next) {
        this.n = value;
        this.next = next;
    }
}

class LinkedListQues5 {

    public Node findMergingPoint(Node head1, Node head2) {
        int length1 = 0;
        int length2 = 0;
        var start = head1;
        var ptr = null;
        var temp = null;
        var diff = 0;
        while (start != null) {
            start = start.next;
            length1++;
        }

        start = head2;
        while (start != null) {
            start = start.next;
            length2++;
        }

        if (length1 >= length2) {
            ptr = head1;
            temp = head2;
        } else {
            ptr = head2;
            temp = head1;
        }
        var diff = Math.abs(length1 - length2);
        while (diff > 0 && ptr != null) {
            ptr = ptr.next;
            diff--;
        }
        var temp = if (length1 >= length2) head2 else head1;
        while (temp != null && ptr != null) {
            if (temp == ptr) return temp;
            temp = temp.next;
            ptr = ptr.next;
        }
        return null;
    }
}