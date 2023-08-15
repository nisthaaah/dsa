package leetcode.Sorting;
public class sSort {
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
    
        public sSort(int value) {
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
        
        public void selectionSort(){
            if(length < 2) return;
            Node curr = head;
            while(curr.next!=null){
                Node smallest=curr;
                Node innerCurr=curr.next;
                while(innerCurr!=null){
                    if(innerCurr.value < smallest.value){
                        smallest=innerCurr;
                    }
                    innerCurr=innerCurr.next;
                }
                if(smallest!=curr){
                    int temp=curr.value;
                    curr.value=smallest.value;
                    smallest.value=temp;
                }
                curr=curr.next;
            }
            curr=tail;
            
        }
    }

