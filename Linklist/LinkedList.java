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

    //Design a method to add node at the beginning of linkedList
    public void addAtStart(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            count++;
            return;
        }
        newNode.next = head;
        count++;
        head = newNode;
    }

    //Design a method to get first node values
    public int getFirstVal(Node head) {
        if (head == null) {
            throw new IllegalStateException("List is empty, no first value.");
        }
        return head.val;
    }

    //Design a method to get last node values
    public int getLastVal(Node tail) {
        if (tail == null) {
            throw new IllegalStateException("List is empty, no Last value.");
        }
        return tail.val;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //function call add at end
        ll.addAtEnd(1);
        ll.addAtEnd(2);
        ll.addAtEnd(3);

        //function call display
        ll.display(head);

        //function call add at start
        ll.addAtStart(4);
        System.out.println();
        ll.display(head);

        //  Node count
        System.out.println("\nNode count: "+count);

        //get first node value
        System.out.println("First val: "+ll.getFirstVal(head));

        //get last node value
        System.out.println("Last val: "+ll.getLastVal(tail));
    }
}
