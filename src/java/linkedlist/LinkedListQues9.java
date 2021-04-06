package linkedlist;

protected class Node {
    int n;
    Node next;

    Node (int value, Node next) {
        this.n = value;
        this.next = next;
    }
}

class LinkedListQues9 {
    Node head;

    public Node mergeLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        var ptr1 = head1;
        var ptr2 = head2;
        var head3 = null;
        var prev = null;
        while (ptr1 != null && ptr2 != null) {
            var temp = Node(-1, null);
            if (ptr1.n < ptr2.n) {
                temp.n = ptr1.n;
                ptr1 = ptr1.next
            } else {
                temp.n = ptr2.n;
                ptr2 = ptr2.next;
            }
            if (head3 == null) {
                head3 = temp;
                prev = head3;
            } else {
                prev.next = temp;
                prev = temp;
            }
        }
        if (ptr1 == null && ptr2 != null) {
            var temp = Node(ptr2.n, null);
            prev.next = temp;
            prev = temp;
            ptr2 = ptr2.next;
        } else if(ptr2 == null && ptr1 != null) {
            var temp = Node(ptr1.n, null);
            prev.next = temp;
            prev = temp;
            ptr1 = ptr1.next;
        }
        return head3;
    }
}