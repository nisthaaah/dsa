package leetcode.Stack;
import java.util.*;

public class usingQueue {
    Queue<Integer> q;

    public usingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x){
        q.offer(x);
        
        for(int i = 0; i < q.size() - 1; i++){
            q.offer(q.poll());
        }
    }

    public int pop(){
        if(!q.isEmpty()){
            return q.poll();
        }
        return -1;
    }

    public int top(){
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    public static void main(String[] args){
        usingQueue stack = new usingQueue();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); 

        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Pop: " + stack.pop()); 

        System.out.println("Is empty? " + stack.isEmpty()); 

        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Is empty? " + stack.isEmpty());

    }

    
}
