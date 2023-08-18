package leetcode.LinkedList;

public class merge {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public void printList() {
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

    public Node mergeTwoLists(Node list1, Node list2) {
        Node temp = new Node(-1);
        Node curr = temp;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        
        return temp.next;
    }

    public static void main(String[] args) {
        merge m = new merge();

        // Creating linked list 1
        m.append(1);
        m.append(3);
        m.append(5);

        // Creating linked list 2
        merge m2 = new merge();
        m2.append(2);
        m2.append(4);
        m2.append(6);

        // Merging two linked lists
        Node mergedList = m.mergeTwoLists(m.head, m2.head);
        m.printList(mergedList);

        // while (mergedList != null) {
        //     System.out.print(mergedList.value + " ");
        //     mergedList = mergedList.next;
        // }
    }
}
