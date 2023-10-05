package leetcode.String;

public class moveRepeated {
    public String move(String input){
      StringBuilder repeated = new StringBuilder();
      StringBuilder nonRepeated = new StringBuilder();

      int i = 0;
        while (i < input.length()) {
            char currentChar = input.charAt(i);
            int count = 0;
      

            while (i < input.length() && input.charAt(i) == currentChar) {
                count++;
                i++;
            }

            if (count > 1) {
              for (int k = 1; k <= count; k++) {
                repeated.append(currentChar);
            }
            } else {
                nonRepeated.append(currentChar);
            }
        }
      return nonRepeated.toString() + repeated.toString();
    }

    public static void main(String[] args) {
      String s = "abcxxd";
      System.out.println(new moveRepeated().move(s));
    }
}