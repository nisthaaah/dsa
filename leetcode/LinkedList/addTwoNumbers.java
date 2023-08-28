package leetcode.LinkedList;

public class addTwoNumbers {
    Node head;
    Node tail;

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Node addTwoNumbers(Node l1, Node l2){
        Node temp = new Node(0);
        Node curr = temp;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if(l1!=null){ //2 -> 4 -> 3
                sum += l1.value; //sum = 0+2 = 2 || sum = 0+4 = 4 || sum = 0+3 = 3
                l1 = l1.next; //4 || 3
            }
            if(l2!=null){ //5 -> 6 -> 4
                sum += l2.value; //sum = 2+5 = 7 || sum=4+6 = 10 || sum = 3+4 = 7
                l2 = l2.next; //6 || 4
            }
            sum += carry; //sum = 7 || sum = 10 || sum = 7+1 = 8
            carry = sum/10; //carry = 0 || carry = 1 || carry = 0 
            curr.next = new Node(sum % 10); // (7 % 10) = 7 || (10 % 10) = 0 || (8 % 10) = 8
            curr = curr.next; //7 -> 0 -> 8
        }
        return temp.next;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args){
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);
        
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = new addTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("The addition is: ");
        new addTwoNumbers().printList(result);
    }
}