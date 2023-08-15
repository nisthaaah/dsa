package leetcode.Sorting;
public class iSort {

        private Node head;
        private Node tail;
        private int length;
    
        class Node {
            int value;
            Node next;
    
            Node(int value) {
                this.value = value;
            }
        }
    
        public iSort(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }
    
        public Node getHead() {
            return head;
        }
    
        public Node getTail() {
            return tail;
        }
    
        public int getLength() {
            return length;
        }
    
        public void makeEmpty() {
            head = null;
            tail = null;
            length = 0;
        }
    
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    
        public void append(int value) {
            Node newNode = new Node(value);
            if (length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }
        
        public void insertionSort(){
            if(length<2) return;
            Node sortedListHead=head;
            Node unsortedListHead=head.next;
            sortedListHead.next=null;
            
            while(unsortedListHead!=null){
                Node curr=unsortedListHead;
                unsortedListHead=unsortedListHead.next;
                
                if(curr.value < sortedListHead.value){
                    curr.next=sortedListHead;
                    sortedListHead=curr;
                }
                else{
                    Node searchptr = sortedListHead;
                    while(searchptr.next!=null && curr.value>searchptr.next.value){
                        searchptr = searchptr.next;
                    }
                        curr.next=searchptr.next;
                        searchptr.next=curr;
                         
                    }
                }
                head=sortedListHead;
                Node temp = head;
                while (temp.next != null) {
                temp = temp.next;
                }
                tail = temp;
                
            }
        }
