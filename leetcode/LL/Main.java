package leetcode.LL;

public class Main {

    public static void main(String[] args) {

        Ques ll = new Ques(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        

        System.out.println("Middle Node:");
        System.out.println( ll.findMiddleNode().value);
        System.out.println("Has Loop:");
        System.out.println( ll.hasLoop());

    }

}
    
