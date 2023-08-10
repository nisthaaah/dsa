package tcs;

public class nonRepeating {

        public static int firstNonRepeating(int[] arr) {
            int[] frequency = new int[1000001];  // Assuming array elements are within this range
            
            // Count the frequency of each element
            for (int num : arr) {
                frequency[num]++;
            }
            
            // Find the first non-repeating element
            for (int num : arr) {
                if (frequency[num] == 1) {
                    return num;
                }
            }
            
            return -1;  // If no non-repeating element is found
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 2, 8, 8, 5, 5, 4, 1};
            int result = firstNonRepeating(arr);
            if (result != -1) {
                System.out.println("The first non-repeating element is: " + result);
            } else {
                System.out.println("No non-repeating element found in the array.");
            }
        }
    }
