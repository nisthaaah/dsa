package leetcode.LinkedList;

public class reverseLL{
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] main){
        reverseLL ll = new reverseLL();

       ll.append(1); 
       ll.append(2);
       ll.append(3);
       ll.append(4);
       ll.append(5);
       
       System.out.println("Original Linked List:");
       ll.printList(ll.head);

       ll.head = ll.reverse(ll.head);

       System.out.println("\nReversed Linked List:");
       //ll.reverse(ll.head);
       ll.printList(ll.head);
        
    }
}