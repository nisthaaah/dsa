package leetcode.String;

public class rotateString {
    public boolean rotate(String s, String goal){
        if(s.length() != goal.length()) return false;

        String doubleS = s + s;
        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcd";
        String goal = "dabc";
        System.out.println("String " +s+ " can become " +goal+ " after some shifts: " +new rotateString().rotate(s, goal));
    }
}