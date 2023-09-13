package leetcode.LinkedList;

public class middleNode{
    
    //find Middle node
    public Node findMiddleNode(){ //1-> 2-> 3-> 4-> 5-> 6
        Node slow=head; ///1
        Node fast=head; //1
        while(fast!=null && fast.next!=null){
            slow=slow.next; //2, 3, 4
            fast=fast.next.next; //3, 5
        }
        return slow; //4
    }

    //methods
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public middleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
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
    public static void main(String[] args) {

        middleNode ll = new middleNode(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.printList();
        
        System.out.println("Middle Node:");
        System.out.println( ll.findMiddleNode().value);

    }
}  