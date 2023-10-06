package recursion;

public class moveToEnd {
    public static void move(String s, String newStr, int i, int count){
        if(i == s.length()){
            for(int j = 0; j < count; j++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char curr = s.charAt(i);
        if(curr == 'x'){
            count++;
            move(s, newStr, i + 1, count);
        }
        else{
            newStr += curr;
            move(s, newStr, i + 1, count);
        }
    }

    public static void main(String[] args) {
        String s = "abxxcxx";
        move(s, " ", 0, 0);
    }
}
