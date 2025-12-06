package Linklist;

import java.util.Scanner;

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

    //Get node value at specific position
    public int getSpecificVal(Node head, int n) {
        if (n < 1 || n > count) {
            throw new IndexOutOfBoundsException("Index " + n + " is out of bounds. Valid range: 1 to " + count);
        }

        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }
        Node temp = head;
        for(int i=1; i<n; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    //Get node value at middle position
    public int getMiddleVal(Node head) {
        if(head == null) {
            throw new IllegalStateException("List is empty.");
        }
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    //Design a method to check if linkedlist is empty
    public boolean isEmpty(Node head) {
        return head == null;
    }

    //Design a method to clear the linkedList
    public void clear() {
        LinkedList.head = null;
        count = 0;
    }

    //Design a method to remove first node
    public Node removeFirstNode(Node head) {
        if(head == null) {
            throw new IllegalStateException("List is empty");
        }
        count--;
        return head.next;
    }

    //Design a method to remove last node
    public Node removeLastNode(Node head) {
        Node temp = head;
        if(head == null) {
            throw new IllegalStateException("List is empty");
        }
        if(head.next == null) {
            head = tail = null;
            count--;
            return tail;
        }
        while(temp.next.next !=null) {
            temp = temp.next;
        }
        temp.next = null;
        count--;
        tail = temp;
        return tail;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        //function call add at end
        ll.addAtEnd(1);
        ll.addAtEnd(2);
        ll.addAtEnd(3);

        //function call display
        ll.display(head);

        //function call add at start
        ll.addAtStart(4);
        ll.addAtStart(7);
        System.out.println();
        ll.display(head);

        //  Node count
        System.out.println("\nNode count: "+count);

        //get first node value
        System.out.println("First val: "+ll.getFirstVal(head));

        //get last node value
        System.out.println("Last val: "+ll.getLastVal(tail));

        //get specific node val
        /* 
        System.out.println("Enter the nth node number starting from 0 to "+count);
        int n = sc.nextInt();
        System.out.println(n+" Node val:"+ll.getSpecificVal(head,n));
        */

        //Get middle node
        System.out.println("Middle Node val:"+ll.getMiddleVal(head));

        //check linkedlist is empty
        System.out.println("Linkedlist isEmpty: "+ll.isEmpty(head));

        //clear
        /* 
        ll.clear();
        ll.display(head);
        */

        //To remove first node
        System.out.println(ll.removeFirstNode(head).val);

        //Remove last node
        System.out.println("last node is: "+ll.removeLastNode(head).val);
    }
}
