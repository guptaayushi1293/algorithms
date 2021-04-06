package linkedlist;

class LinkedListQues3{
    private Node head;

    class Node {
        int value;
        Node next;
    }

    // 1->2->3->5->null
    // insert 4
    public void insertNodeInSortedList(int value) {
        var node = new Node(value);
        if (this.head == null) {
            this.head = node;
        }
        var start = this.head;
        var prev = this.head;
        while (start != null && start.value <= value) {
            prev = start;
            start = start.next;
        }
        node.next = start;
        prev.next = node;
    }
}