package tcs;
import java.util.*;

public class balloonColor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of balloons: ");
            int N = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            String[] balloons = new String[N];
            System.out.println("Enter the colors of balloons: ");
            for (int i = 0; i < N; i++) {
                balloons[i] = sc.nextLine();
            }
            
            String oddColor = findOddColor(balloons);
            System.out.println(oddColor);
        }
        
        public static String findOddColor(String[] balloons) {
            for (int i = 0; i < balloons.length; i++) {
                int count = 0;
                
                for (int j = 0; j < balloons.length; j++) {
                    if (balloons[j] != null && balloons[j] == (balloons[i])) {
                        count++;
                    }
                }
                
                if (count % 2 == 1) {
                    System.out.println("The odd colored balloon: ");
                    return balloons[i];
                }
                
                balloons[i] = null; // Mark checked colors as null
            }
            
            return "All are even";
        }
}
