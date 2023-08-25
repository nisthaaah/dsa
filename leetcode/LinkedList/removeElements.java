package leetcode.LinkedList;

public class removeElements {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Node removeElements(Node head, int value){ //recursive approach
        if(head == null) return head;
        Node newNode = removeElements(head.next, value);
        if(head.value == value) return newNode;
        head.next = newNode;
        return head;
    }

    // public Node removeElements(Node head, int value){ //iterative approach
    //     if(head == null) return head;
    //     Node prev = null;
    //     Node curr = head;

    //     while(curr!= null){
    //         if(curr.value == value){
    //             if(prev == null) head = curr.next;
    //             else prev.next = curr.next;
    //         }
    //         else{
    //             prev = curr;
    //         }
    //         curr = curr.next;
    //     }
    //     return head;
    // }
    
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

    public static void main(String[] args){
        removeElements  r = new removeElements();
        r.append(1);
        r.append(2);
        r.append(6);
        r.append(3);
        r.append(4);
        r.append(5);
        r.append(6);

        System.out.println("Original Linked list: ");
        r.printList(r.head);

        Node updatedHead = r.removeElements(r.head, 6);
    
        System.out.println("\nLinked List after removing elements: ");
        r.printList(updatedHead);
    }
}
