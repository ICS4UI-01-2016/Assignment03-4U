/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class ProgrammingExcercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgrammingExcercises test = new ProgrammingExcercises();
        // Create an array containing 10 elements 
        int[] n = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        // Question 6
        System.out.println("Question 6:");
        // Print the method named insertionSort
        test.countingSort(n);
        // Printing the elements individually 
        for (int x = 0; x < n.length; x++) {
            System.out.println(n[x]);
        }

        // Question 7
        System.out.println("Question 7:");
        test.countingSort(n);
        for (int x = 0; x < n.length; x++) {
            System.out.println(n[x]);
        }

        // Question 8
    }

    // Question 6
    public void insertionSort(int[] n) {
        // Runs throught the position of the array
        for (int i = 0; i < n.length; i++) {
            // Start at whatever i value and continues decreasing until the set of elements is sorted properly
            int j = i;
            // While the number n[j - 1] is less than n[j]
            while (j > 0 && n[j - 1] < n[j]) {
                // Swtich the integers
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                // Continue to decrease until element reaches sorted set of elements 
                j--;
            }
        }
    }

    // Question 7
    public void countingSort(int[] n) {
        // Create an array named tracker and set it to 101 elements, which helps keep track of how many numbers of each there are
        int[] tracker = new int[101];
        // Runs through the position of the array
        for (int i = 0; i < n.length; i++) {
            // For every spot in the array, the spot in the tracker array that corresponds to the number n[i] is increased by 1
            tracker[n[i]]++;
        }
        // Create a new integer 
        int x = 0;
        for (int i = 0; i < tracker.length; i++) {
            // If the tracker array number is not equal to zero, have a for loop go through the entire array with the integer x involved and then sort!
            if (tracker[i] != 0) {
                // The amount of time the number at x is used
                for (int y = 0; y < tracker[x]; y++) {
                    // Sort the array
                    n[x] = i;
                    x++;
                }
            }
        }
    }
    // Question 8
}
