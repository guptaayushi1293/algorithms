package linkedlist;

class LinkedListQues3 {
    private Node head;

    class Node {
        int value;
        Node next;
    }

    // 1->2->3->4->5->null
    // null<-1<-2<-3<-4<-5
    public Node reverseListNonRecursive(Node head) {
        if (head == null || head.next == null) return head;
        var prev = head;
        var start = head.next;
        while (start.next != null) {
            var temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;
        }
        start.next = prev;
        head.next = null;
        return start;
    }

    public Node reverseList(Node head) {
        if (head == null || head.next == null) return head;
        var temp = head.next;
        head.next = null;
        var secondElem = reverseList(temp);
        temp.next = head;
        return secondElem;
    }
}