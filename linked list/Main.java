public class Main {
    
    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1(7);

        ll.getHead();
        ll.getTail();
        ll.getLength();
        ll.set(1, 4);
        ll.append(2);
        ll.append(8);
        ll.prepend(3);
        //ll.removeFirst();
        //ll.insert(1, 0);
        //ll.remove(2);
        //ll.reverse();
        
        

        System.out.println("\nLinked List:");
        ll.printList();
        //System.out.println("\nLinked List after removing the last node:");
        //System.out.println(ll.removeLast().value);
        //System.out.println(ll.removeLast().value);
        //System.out.println(ll.removeLast());
        //ll.removeLast();
        //ll.printList();
        System.out.println("The value at the index: ");
        System.out.println(ll.get(1).value);
        
    }
}
