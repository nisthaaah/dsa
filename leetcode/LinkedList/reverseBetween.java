package leetcode.LinkedList;

public class reverseBetween {
    private Node head;
    private Node tail;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Node reverseBetween(Node head, int left, int right){
        if(head == null) return head; // 1->2->3->4->5
        Node temp = null;
        Node dummy = new Node(0);
        dummy.next = head; //dummy->1->2->3->4->5
        Node prev = dummy; //(prev)dummy->1->2->3->4->5

        for(int i = 0; i < left - 1; i++){
            prev = prev.next; //dummy->1(prev)->2->3->4->5
        }
        tail = prev.next; //dummy->1(prev)->2(tail)->3->4->5
        for(int i = left; i < right; i++){
            temp = prev.next; //dummy->1(prev)->2(tail)(temp)->3->4->5 ||dummy->1(prev)->3(temp)->2(tail)->4->5
            prev.next = tail.next; //dummy->1->3 ||dummty->1->4
            tail.next = tail.next.next; //dummy->1->3 2->4->5 ||dummy->1->4 3->2->5
            prev.next.next = temp; //dummy->1->3->2->4->5 ||dummy->1->4->3->2->5
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
        head.next.next.next.next = new Node(5);

        int left = 2;
        int right = 4;

        Node reversed = new reverseBetween().reverseBetween(head, left, right);

        System.out.println("The reversed list is: ");
        printList(reversed);
    }
}
