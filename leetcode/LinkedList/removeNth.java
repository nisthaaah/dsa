package leetcode.LinkedList;

public class removeNth {
    private Node head;
    private Node tail;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Node removeNthFromLast(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
        head.next.next.next.next = new Node(5);

        Node removed = new removeNth().removeNthFromLast(head, 3);

        System.out.println("The list after removing the node from the end is: ");
        printList(removed);
    }
}