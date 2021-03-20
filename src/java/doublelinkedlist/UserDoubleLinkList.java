package doublelinkedlist;

class Node {
    int value;
    Node next;
    Node prev;

    Node (int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

public class UserDoubleLinkList {
    Node head;

    public void create(int value) {
        Node node = Node(value, null, null);
        if (head == null) {
            head = node;
        } else {
            var start = head;
            while (start.next != null) {
                start = start.next;
            }
            node.prev = start;
            start.next = node;
        }
    }

    public void traverse() {
        var node = head;
        while (node != null) {
            System.out.println("Value of node -> " + node.value);
            node = node.next;
        }
    }

    public void insertNode(int value, int pos) {
        var node = Node(value, null, null);
        if (pos == 0 || this.head == null) {
            head = node;
        } else {
            var start = head;
            while (pos > 0 && start != null) {
                start = start.next;
                pos--;
            }
            node.next = start;
            node.prev = start.prev;
            start.prev = node;
            if (node.next != null) node.next.prev = node;
        }
    }

    public boolean deleteNode(int pos) {
        if (this.head == null) return false;
        var start = head;
        while (pos > 0 && start.next != null) {
            start = start.next;
            pos--;
        }
        start.prev.next = start.next;
        if (start.next != null) start.next.prev = start.prev;
        start.next = null;
        start.prev = null;
        return true;
    }

    public int countNodes() {
        var count = 0;
        var start = head;
        while (start != null) {
            start = start.next;
            count++;
        }
        return count;
    }
}