package leetcode.LinkedList;

public class hasLoop {
    public boolean hasLoop(){
        Node fast = head;
	    Node slow =head;
	    
	    while( fast != null && fast.next != null ){
	          slow = slow.next;
	          fast=fast.next.next;
	          
	        if(fast == slow){
	        return true;
	        }
	    }
	    return false;
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

        hasLoop ll = new hasLoop();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        ll.tail.next = ll.head.next;
        //ll.printList();

        System.out.println("Has Loop:");
        System.out.println(ll.hasLoop());
        }
    }   
