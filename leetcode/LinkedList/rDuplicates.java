package leetcode.LinkedList;

public class rDuplicates {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public static Node removeDuplicates(Node head){
        if(head == null){
            return head;
        }
        Node temp = head;
        while(temp.next!= null){
            if(temp.value != temp.next.value){
                temp = temp.next;
            }
            else{
                temp.next = temp.next.next;
            }
        }
        return head;
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
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    public static void main(String[] args){
        rDuplicates rd = new rDuplicates();
        rd.append(1);
        rd.append(1);
        rd.append(2);
        rd.append(3);
        rd.append(3);

        System.out.println("Original Linked List:");
        rd.printList(rd.head);

        Node result = rd.removeDuplicates(rd.head);

        System.out.println("\nLinked List after removing duplicates:");
        rd.printList(result);
    }
    
}
