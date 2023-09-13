package leetcode.LinkedList;

public class binaryToInt {
    Node head;
    Node tail;

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public int binaryToInt(Node head){
        int sum = 0;
        while(head != null){
            sum = (sum << 1) + head.value; // 0 * 2 + 1 => 1 || 1 * 2 + 0 => 2 || 2 * 2 + 1 => 5
            head = head.next;
        }
        return sum; //5
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);

        System.out.println("The decimal value of the number in the linked list is: " +new binaryToInt().binaryToInt(head));
    }
}