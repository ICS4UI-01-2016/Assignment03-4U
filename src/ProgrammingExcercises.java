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
        int[] numList = {10, 9, 8, 10, 6, 5, 4, 3, 2, 1, 0, 13, 15, 13, 3, 4, 23, 5, 6};

        // Print out Question 6
        System.out.println("Question 6:");
        // Printing the elements individually 
        for (int i = 0; i < numList.length; i++) {
            test.insertionSort(numList);
            System.out.print(numList[i] + ", ");
        }
        // Add extra line to look more neat 
        System.out.println();

        // Print out Question 7
        System.out.println("Question 7:");
        for (int i = 0; i < numList.length; i++) {
            test.countingSort(numList);
            System.out.println(numList[i]);
        }

        // Print out Question 8
    }

    // Question 6
    public void insertionSort(int[] n) {
        // Runs throught the positions of the array
        for (int i = 0; i < n.length; i++) {
            // Start at whatever i value and continues decreasing until the set of elements is sorted properly
            // Create a new intereger and set it equal to i
            int j = i;
            // If the element is greater than 0 and the smaller element is found before the bigger element, it is ok
            // If not, then the elements switch
            while (j > 0 && n[j - 1] < n[j]) {
                // Swtich the integers to arrange them in decreasing order
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
        // Create a new integer and set it to 0, allowing it to be used in the second set of numbers
        int x = 0;
        // Have a for loop go through the second set of numbers!
        for (int i = 0; i < tracker.length; i++) {
            // If the tracker array number is not equal to zero, have a for loop go through the entire array with the integer x involved and then sort!
            while (tracker[i] != 0) {
                // Sort the array
                // Connecting the first set of elements to the second elements 
                n[x] = i;
                x++;
                // Subtract 1 from that certain element each time the loop goes through the second set of numbers
                tracker[i]--;
            }
        }
    }
    // Question 8
}
