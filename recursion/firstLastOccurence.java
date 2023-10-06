package recursion;

public class firstLastOccurence {
    public static int first = -1;
    public static int last = -1;
    public static void occurence(String s, char element, int i){
        if(i == s.length()){
            System.out.println("First occurence of " +element+ ": " +first);
            System.out.println("Last occurence of element " +element+ ": " +last);
            return;
        }
        
        char curr = s.charAt(i);
        if(curr == element){
            if(first == -1){
            first = i;
        } else{
            last = i;
        }
    }
    occurence(s, element, i + 1);
}

    public static void main(String[] args) {
        String s = "abaabac";
        occurence(s, 'a', 0);
        
    }
}