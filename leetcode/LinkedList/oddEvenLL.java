package leetcode.LinkedList;

public class oddEvenLL {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Node oddEven(Node head){
        if(head == null || head.next == null || head.next.next == null) return head;
        
        Node odd = head;
        Node even = head.next;
        Node oddHead = head;
        Node evenHead = head.next;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        oddEvenLL oe = new oddEvenLL();
        oe.append(1);
        oe.append(2);
        oe.append(3);
        oe.append(4);
        oe.append(5);

        System.out.println("\nOriginal Linked List: ");
        oe.printList(oe.head);

        Node res = oe.oddEven(oe.head);

        System.out.println("\nReordered Linked List: ");
        oe.printList(res);
    }
}