public class LinkedList1 {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;

        }
    }
    public LinkedList1(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 2;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next=newNode;
            tail= newNode;
        }
        length++;
    }
    public Node removeLast() {
        if(length==0){
            System.out.println("List is empty");
        }
        Node temp=head;
        Node prev=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
    }
    tail=prev;
    tail.next=null;
    length--;
    if(length==0){
        head=null;
        tail=null;
    }
    return temp;
    }}
