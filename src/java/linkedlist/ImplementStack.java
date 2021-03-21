package linkedlist;

class ImplementStack {
    Node top;
    int size = 0;

    public void push(int value) {
        var node = new Node(value);
        if (top == null) {
            top = node;
        } else {
            node.next = top.next;
            top = node;
        }
        size = size + 1;
    }

    public int pop() {
        if (top == null) {
            return -1;
        } else {
            var node = top;
            top = top.next;
            var value = node.value;
            delete(node);
            size = size - 1;
            return value;
        }
    }

    public int size() {
        return this.size;
    }

    /**
     * Application - find nth node from end of the linked list
     * 1. Create stack using linked list.
     * 2. Top of stack - last element
     * 3. Pop n - 1 elements and then top of stack is nth element.
     * 4. Not a good approach, as elements popped up to get nth element.
     */
    public int getNthElement(int position) {
        while (position > 1 && top != null) {
            top = top.next;
            position = position - 1;
        }
        if (top != null) {
            var node = top;
            return node.value;
        }
        return -1;
    }
}