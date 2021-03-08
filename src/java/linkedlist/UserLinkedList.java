package linkedlist;

class Node {
    int n;
    Node next;

    Node (int value, Node next) {
        this.n = value;
        this.next = next;
    }
}

public class UserLinkedList {
    Node head;

    public void createList(int value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
        } else {
            var start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = node;
        }
    }

    public void traverseList() {
        var node = head;
        while (node != null) {
            System.out.println("Value of node -> " + node.n);
            node = node.next;
        }
    }

    public void insertNode(int value, int position) {
        var node = new Node(value, null);
        if (this.head == null) {
            this.head = node;
        } else if (position == 0) {
            node.next = this.head;
            this.head = node;
        } else {
            var start = this.head;
            while (position > 1) {
                start = start.next;
                position--;
            }
            node.next = start.next;
            start.next = node;
        }
    }

    public void deleteNode(int position) {
        var index = 0;
        var start = this.head;
        var prev = start;
        while (index < position) {
            prev = start;
            start = start.next;
            index++;
        }
        if (prev != null && start != null) prev.next = start.next;
    }
}