package queue;

public class Main3 {
    public static void main(String[] args){
        Queue q = new Queue(7);
    
        q.getFirst();
        q.getLast();
        q.getLength();
        q.Enqueue(0);
        System.out.println("Dequeued node: ");
        System.out.println(q.Dequeue().value); //returns 1st node
        //System.out.println(q.Dequeue().value); //returns 2nd node
        //System.out.println(q.Dequeue()); //returns null

        System.out.println("Queue: ");
        q.printQueue();
    
}
}
