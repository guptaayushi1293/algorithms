import linkedlist.UserLinkedList;

public class JBoot {
    public static void main(String[] args) {
        var linkedList = new UserLinkedList();
        for (int i = 1; i < 6; i++) {
            linkedList.createList(i);
        }
        linkedList.traverseList();
        linkedList.insertNode(8, 0);
        linkedList.traverseList();
        linkedList.deleteNode(2);
        linkedList.traverseList();
    }
}
