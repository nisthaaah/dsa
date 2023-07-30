public class bSort {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public bSort(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    
    public void bubbleSort(){
        if(this.length < 2) return;
        Node sortedUntil = null;
        while(sortedUntil != this.head.next){
            Node curr=head;
            while(curr.next!=sortedUntil){
                Node nextNode = curr.next;
                if(curr.value > nextNode.value){
                    int temp = curr.value;
                    curr.value = nextNode.value;
                    nextNode.value = temp;
                }
                curr = curr.next;
            }
            sortedUntil = curr;
        }
        
    }

}