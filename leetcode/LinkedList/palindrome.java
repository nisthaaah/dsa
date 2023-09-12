package leetcode.LinkedList;

public class palindrome {
    Node head;
    Node tail;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean palindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){ //1-> 2 -> 2 -> 1
            slow= slow.next;
            fast = fast.next.next; 
        }
        if(fast != null && fast.next == null){
            slow = slow.next; //odd number of elements
        }

        Node prev = null;
        Node forward = null;
        while(slow != null && slow.next != null){ //1 -> 2
            forward = slow.next; //2
            slow.next = prev; //1 -> null
            prev = slow; //prev = 1
            slow = forward; //slow = 2
        } // 1 -> 2
        if(slow != null){
            slow = slow.next;
        }

        fast = head; //1
        while(slow != null && fast != null){
            if(slow.value != fast.value) return false;
            else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        return true;
    }

    // public boolean palindrome(Node head){
    //     if(head == null || head.next == null) return true;

    //     Node reverse = null;
    //     Node curr = head; //1
    //     while(curr != null){
    //         Node temp = new Node(curr.value); //1
    //         temp.next = reverse; //1-> null
    //         reverse = temp; // reverse = 1
    //         curr = curr.next; //2
    //     } //3 -> 2 -> 1 -> null

    //     while(head != null || reverse != null){
    //         if(head.value != reverse.value) return false;
    //         else{
    //         head = head.next;
    //         reverse = reverse.next;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        System.out.println("The linked list is palindromic: " +new palindrome().palindrome(head));

    }

}
