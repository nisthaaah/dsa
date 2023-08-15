package tcs;
import java.util.Scanner;

public class doctorFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[20]; // 20 patients a day

        System.out.println("Enter age value (press Enter without a value to stop):");
        int count = 0;
        while (sc.hasNextLine() && count < 20) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }

            int age = Integer.parseInt(input);
            if (isValidAge(age)) {
                ages[count] = age;
                count++;
            } else {
                System.out.println("Invalid age. Age should be between 1 and 120.");
            }
        }

        int earnings = calculateEarnings(ages, count);
        System.out.println("Total earnings for the day: " + earnings + " INR");
    }

    public static boolean isValidAge(int age) {
        return age > 0 && age <= 120;
    }

    public static int calculateEarnings(int[] ages, int count) {
        int totalEarnings = 0;

        for (int i = 0; i < count; i++) {
            int consultationFee = 0;
            if (ages[i] < 17) {
                consultationFee = 200;
            } else if (ages[i] >= 17 && ages[i] <= 40) {
                consultationFee = 400;
            } else {
                consultationFee = 300;
            }
            totalEarnings += consultationFee;
        }

        return totalEarnings;
    }
}
