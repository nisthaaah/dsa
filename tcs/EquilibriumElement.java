package tcs;

public class EquilibriumElement {
        public static int findEquilibriumElement(int[] arr) {
            int totalSum = 0;
            int leftSum = 0;
    
            // Calculate the total sum of all elements in the array
            for (int num : arr) {
                totalSum += num;
            }
    
            // Iterate through the array to find an equilibrium element
            for (int i = 0; i < arr.length; i++) {
                // Update the total sum by subtracting the current element
                totalSum -= arr[i];
    
                // If the left sum equals the remaining total sum, an equilibrium element is found
                if (leftSum == totalSum) {
                    return i; // Return the index of the equilibrium element
                }
    
                // Update the left sum by adding the current element
                leftSum += arr[i];
            }
    
            return -1; // No equilibrium element found
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3,5, 3, 2, 1};
            int result = findEquilibriumElement(arr);
            if (result != -1) {
                System.out.println("Equilibrium element found at index " + result + ": " + arr[result]);
            } else {
                System.out.println("No equilibrium element found");
            }
        }
    }

