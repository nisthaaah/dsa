package leetcode.LinkedList;

public class removeFromEnd {
    public Node remove(Node head, int n){
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = head;
        //1, 2, 3, 4, 5
        for(int i = 0; i < n; i++){ //n = 2
            fast = fast.next; //2
        }
        while(fast != null){
            slow = slow.next; //1, 2, 3
            fast = fast.next; //3, 4, 5
        }
        slow.next = slow.next.next;
        return dummy.next; //1, 2, 3, 5
    }

    Node head;
    Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
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
        removeFromEnd r = new removeFromEnd();
        r.append(1);
        r.append(2);
        r.append(3);
        r.append(4);
        r.append(5);

        System.out.println("\nOriginal Linked list: ");
        r.printList(r.head);

        Node updatedHead = r.remove(r.head, 2);
    
        System.out.println("\nLinked List after removing the element: ");
        r.printList(updatedHead);
    }
}