package leetcode.Queue;
import java.util.*;

public class usingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x){
        if(s1.isEmpty()){
            s1.push(x);
            return;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop(){
        return s1.pop();
    }

    public int peek(){
        return s1.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public static void main(String[] args){
        usingStacks queue = new usingStacks();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Pop: " + queue.pop()); 
        System.out.println("Pop: " + queue.pop()); 

        System.out.println("Is empty? " + queue.isEmpty()); 

        System.out.println("Pop: " + queue.pop()); 
        System.out.println("Is empty? " + queue.isEmpty());    

    }   
}