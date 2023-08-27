package leetcode.Stack;
import java.util.*;

public class usingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    
    public usingQueues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x){
        q1.offer(x);
        top = x;
    }

    public int pop(){
        while(q1.size() > 1){
            top = q1.poll();
            q2.offer(top);
        }
        int poppedValue = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedValue;
    }
    public int top(){
        return top;
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }

    public static void main(String[] args){
        usingQueues stack = new usingQueues();
        
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