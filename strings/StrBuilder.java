package strings;

public class StrBuilder {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append("i"); //str = str + "i" (in case of Strings, a new string is created which takes more time)
        sb1.append("l"); //str = str + "l"
        System.out.println(sb1);


        StringBuilder sb = new StringBuilder("Nistha");
        System.out.println(sb);

        System.out.println(sb.charAt(1));

        sb.insert(5, "a");
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb.length());
    }
    
    
}
