package heap;

public class Main {
    public static void main(String[] args){
        maxHeap h = new maxHeap();
        h.insert(100);
        h.insert(99);
        h.insert(10);
        h.insert(19);
        h.insert(89);

        System.out.println(h.getHeap() +"\n");

        h.insert(200);
        System.out.println("After inserting the new value: \n" +h.getHeap() +"\n");

        h.remove();
        System.out.println("After removing the value: \n" +h.getHeap());
    }
    
}
