package Linklist;

class LinkedList {
    public static int count;
    public static Node head;
    public static Node tail;
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }


    // Design a method to add node at the end of LinkedList.
    public void addAtEnd(int val) {
        if(head == null) {
            Node newNode = new Node(val);
            head = tail = newNode;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }

    // Design a method to print all node values.
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtEnd(1);
        ll.addAtEnd(2);
        ll.addAtEnd(3);
    }
}
