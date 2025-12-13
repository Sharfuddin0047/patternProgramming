package RandomQuestion;

public class Random2 {
    public static Node head;
    public static Node insertNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode; 
            return head;
        } 
        if(head.val>=data) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node curr = head;
        Node nextCurr = head.next;
        while(nextCurr != null) {
            if(data>curr.val && data<=nextCurr.val) {
                newNode.next = nextCurr;
                curr.next = newNode;
                return head;
            }
            curr = curr.next;
            nextCurr = nextCurr.next;
        }

        if(nextCurr == null) {
            curr.next = newNode;
        }
        return head;
    }
}

class Node{
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
