package leetcode.LinkedList;

public class gcdLL {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Node insertGcd(Node head){
        Node curr = head;
        while(curr != null && curr.next != null){
            int gcd = calcGcd(curr.value, curr.next.value); //(18, 6) || (6, 10)
            Node newNode = new Node(gcd); //6 || 
            newNode.next = curr.next; //6 -> 6
            curr.next = newNode; //18 -> 6 -> 6 -> 2 -> 10 -> 1 -> 3
            curr = newNode.next; // curr => 6, 10
        }
        return head;
    }

    public int calcGcd(int a, int b){
        while(a != b){
            if(a > b) a = a - b; // a = 12, 6 || a = 2
            else b = b - a; // b = 4 || b = 2
        }
        return a; //6 || 2
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
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args){
        gcdLL g = new gcdLL();
        g.append(18);
        g.append(6);
        g.append(10);
        g.append(3);

        System.out.println("Original Linked list: ");
        g.printList(g.head);

        System.out.println("\nLinked List after inserting GCD: ");
        g.printList(g.insertGcd(g.head));
    }
}