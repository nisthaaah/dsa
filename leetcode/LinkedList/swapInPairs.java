package leetcode.LinkedList;

public class swapInPairs {
    private Node head;
    private Node tail;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Node swapInPairs(Node head){
        if(head == null) return head;
        Node curr = head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while(curr != null && curr.next != null){
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = curr;

            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node swapped = new swapInPairs().swapInPairs(head);

        System.out.println("The Linked List after swapping: ");
        printList(swapped);
    }
}