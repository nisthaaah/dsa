package leetcode.LinkedList;

public class reverseKGroup {
    Node head;
    Node tail;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Node reverseKGroup(Node head, int k){
        int length = lengthOfLL(head);
        return reverseKGroup(head, k, length); //5
    }

    public Node reverseKGroup(Node head, int k, int length){
        if(length < k) return head;

        Node curr = head; //prev 1->2->3->4->5 
        Node prev = null;
        Node forward = null;

        int count = 0;
        while(curr != null && count < k){
            forward = curr.next; //prev 1(curr)->2(forward)->3->4->5 || 3->4->5
            curr.next = prev; //1<-2 3->4->5
            prev = curr; 
            curr = forward; //1(prev)<-2(curr) 3->4->5
            count++; //1
        }
        if(forward != null){
            head.next = reverseKGroup(forward, k, length - k); //3->4->5
        }
        return prev;
    }

    public int lengthOfLL(Node head){
        int length = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
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

        Node reversed = new reverseKGroup().reverseKGroup(head, 2);

        System.out.println("The reversed list is: ");
        printList(reversed);
    }
}