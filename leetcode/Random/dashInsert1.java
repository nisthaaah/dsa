package leetcode.Random;

public class dashInsert1 {
    public String dashInsert(String s){
        StringBuilder res = new StringBuilder();
        boolean prevOdd = false;

        for(char c : s.toCharArray()){
            int digit = c - '0'; //9

            if(digit % 2 == 1 && digit != 0){
                if(prevOdd){
                    res.append('-'); //9-9-946
                }
                prevOdd = true; //true
            }
                else{
                    prevOdd = false;
            }
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "99946";
        System.out.println("The result is " +new dashInsert1().dashInsert(s));
    }
}
