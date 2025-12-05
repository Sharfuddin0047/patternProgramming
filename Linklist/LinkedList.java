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
        Node newNode = new Node(val);
        if(head == null) {
            count++;
            head = tail = newNode;
            return;
        }
        count++;
        tail.next = newNode;
        tail = newNode;
    }

    // Design a method to print all node values.
    public void display(Node head) {
        if(head == null) {
            System.out.println(head);
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtEnd(1);
        ll.addAtEnd(2);
        ll.addAtEnd(3);

        ll.display(head);
    }
}
