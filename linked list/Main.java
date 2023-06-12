public class Main {
    
    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1(7);

        ll.getHead();
        ll.getTail();
        ll.getLength();
        ll.append(2);
        

        System.out.println("\nLinked List:");
        ll.printList();
        System.out.println("\nLinked List after removing:");
        ll.removeLast();
        ll.printList();
        
    }
}
