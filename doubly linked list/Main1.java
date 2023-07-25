public class Main1 {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList(7);

        //dll.getHead();
        //dll.getTail();
        //dll.getLength();
        dll.append(4);
        dll.append(14);
        //System.out.println(dll.removeLast().value);
        //System.out.println(dll.removeLast().value);
        //System.out.println(dll.removeLast());
        dll.prepend(1);
        //dll.removeFirst();
        dll.printList();
        System.out.println("The value at the index: ");
        System.out.println(dll.get(0).value);
        //System.out.println("After set method: ");
        //dll.set(0,6);
        //dll.printList();
        System.out.println("The values after inserting: ");
        dll.insert(2,10);
        dll.printList();
        System.out.println("The values after removing: ");
        dll.remove(1);
        dll.printList();
    
}
}
