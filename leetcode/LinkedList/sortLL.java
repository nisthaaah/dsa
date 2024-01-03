package leetcode.LinkedList;

public class sortLL {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Node sortList(Node head){
        if(head == null || head.next == null) return head;

        Node prev = null;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        Node left = sortList(head);
        Node right = sortList(slow);

        return merge(left, right);
    }

    private Node merge(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.value < l2.value){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if(l1 != null){
            curr.next = l1;
        }
        else{
            curr.next = l2;
        }

        return dummy.next;
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
        sortLL sl = new sortLL();
        sl.append(7);
        sl.append(1);
        sl.append(2);
        sl.append(3);

        System.out.println("\nOriginal Linked List: ");
        sl.printList(sl.head);

        Node res = sl.sortList(sl.head);

        System.out.println("\nSorted Linked List: ");
        sl.printList(res);
    }
}