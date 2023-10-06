package recursion;

public class removeDuplicates {
    public  static boolean[] map = new boolean[26];
    public static void remove(String s, int i, String newStr){
        if(i == s.length()){
            System.out.println(newStr);
            return;
        }

        char curr = s.charAt(i);
        if(map[curr - 'a']){ //a - a => 0 || b - a => 1 ||c - a => 3 || d - a => 4
            remove(s, i + 1, newStr);
        }
        else{
            newStr += curr;
            map[curr - 'a'] = true;
            remove(s, i + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String s = "abaaccd";
        remove(s, 0, "");
    }
}