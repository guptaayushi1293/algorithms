package linkedlist;

class Node {
    int value;
    Node next;
}

public class LinkedListQues2 {
    Node head;

    public Node containsCycle() {
        var slowPtr = head;
        var fastPtr = head;

        while (fastPtr && fastPtr.next) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) return fastPtr;
        }
        return null;
    }

    public Node startOfCycle() {
        var node = containsCycle();
        if (node == null) return null;
        var slowPtr = head;
        while (slowPtr != node) {
            slowPtr = slowPtr.next;
            node = node.next;
        }
        return slowPtr;
    }

    public int lengthOfLoop() {
        var node = startOfCycle();
        if (node == null) return 0;
        var count = 1;
        var temp = node.next;
        while (temp != node) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}