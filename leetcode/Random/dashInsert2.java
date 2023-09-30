package leetcode.Random;

public class dashInsert2 {
    public String dashInsert2(String s){
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){//< 7
            char currChar = s.charAt(i); //4

            res.append(currChar); //4

            if(i < s.length() - 1){ //< 6
                char nextChar = s.charAt(i + 1); //5

                int currDigit = currChar - '0';
                int nextDigit = nextChar - '0';

                if(currDigit % 2 != 0 && nextDigit % 2 != 0){
                    res.append('-');
                }
                else if (currDigit % 2 == 0 && nextDigit % 2 == 0){
                    res.append('*');
            }
        }
    }
    return res.toString();
}

    public static void main(String[] args) {
        String s = "4546793";
        System.out.println("The result is " +new dashInsert2().dashInsert2(s));
    }
}