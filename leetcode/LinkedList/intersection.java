package leetcode.LinkedList;
import java.util.*;

public class intersection {
    public Node intersection(Node headA, Node headB){
        if(headA == null || headB == null) return null;

        Node a_ptr = headA;
        Node b_ptr = headB;

        while(a_ptr!=b_ptr){
            if(a_ptr!=null){
                a_ptr = a_ptr.next;
            }
            else{
                a_ptr = headB;
            }
            if(b_ptr!=null){
                b_ptr = b_ptr.next;
            }
            else{
                b_ptr = headA;
            }
        }
        return a_ptr;
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        intersection ll = new intersection();
        
        Node headA = ll.new Node(1);
        headA.next = ll.new Node(2);
        headA.next.next = ll.new Node(3);

        Node headB = ll.new Node(4);   
        headB.next = ll.new Node(5);  // 1-> 2-> 3
                                            // 4-> 5 -> 2
        headB.next.next = headA.next; // creating intersection

        Node intersectionNode = ll.intersection(headA, headB);
        System.out.println("Intersection Node Value: " +intersectionNode.value);
        }
}
