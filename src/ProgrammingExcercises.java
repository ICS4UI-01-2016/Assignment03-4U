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
        // Create an array containing 8 elements for question 6 and 7
        int[] numList = {2, 10, 6, 3, 9, 3, 2, 2};

        // Print out Question 6
        System.out.println("Question 6:");
        // Printing the elements individually 
        for (int i = 0; i < numList.length; i++) {
            // Calling the method
            test.insertionSort(numList);
            // Printing the method
            System.out.println(numList[i]);
        }

        // Print out Question 7
        System.out.println("Question 7:");
        for (int i = 0; i < numList.length; i++) {
            // Calling the method
            test.countingSort(numList);
            // Printing the method
            System.out.println(numList[i]);
        }

        // Print out Question 8
        System.out.println("Question 8:");
        // String of words!
        String[] wordList = {"Hello", "Apple", "Tesla", "TechCrunch", "Google", "Beta"};
        // Printing the elements individually
        for (int i = 0; i < wordList.length; i++) {
            // Calling the method
            test.stringSort(wordList);
            // Printing the method
            System.out.println(wordList[i]);
        }
    }

    // Question 6
    public void insertionSort(int[] n) {
        // Runs through all the positions of the array
        for (int i = 0; i < n.length; i++) {
            // Start at whatever i value and continues decreasing until the set of elements is sorted properly
            // Create a new integer and set it equal to i
            int j = i;
            // If the element is greater than 0 and a smaller element is found before the bigger element, switch!
            while (j > 0 && n[j - 1] < n[j]) {
                // Switch the integers to arrange them in decreasing order
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                // Continue to decrease until the very last element 
                j--;
            }
        }
    }

    // Question 7
    public void countingSort(int[] n) {
        // Create an array named tracker and set it to 101 elements, which helps keep track of how many numbers of each there are
        int[] tracker = new int[101];
        // Runs through the positions of the array
        for (int i = 0; i < n.length; i++) {
            // For every spot in the array, the spot in the tracker array that corresponds to the number n[i] is increased by 1 (bucket analogy)
            tracker[n[i]]++;
        }
        // Create a new integer and set it to 0, allowing it to be used in the second set of numbers
        int x = 0;
        // Have a for loop go through the second set of numbers (the tracker numbers)!
        for (int i = 0; i < tracker.length; i++) {
            // If the tracker array number is not equal to zero, have a for loop go through the entire array with the integer x involved and then sort!
            while (tracker[i] != 0) {
                // Sort the array
                // Connecting the first set of elements (Original set of elements) to the second set of elements (Tracker numbers) 
                n[x] = i;
                x++;
                // Subtract 1 from that certain element (within a certain index) each time the loop goes through the second set of numbers
                tracker[i]--;
            }
        }
    }

    // Question 8
    public void stringSort(String[] word) {
        // Runs through the positions of the array
        for (int i = 0; i < word.length; i++) {
            // Create a new intereger and set it equal to i
            int j = i;
            // If the element is greater than 0 and the strings are compared to see which is alphabetical order, switch it!
            while (j > 0 && word[j - 1].compareToIgnoreCase(word[j]) > 0) {
                // Switch the integers to arrange themselves in alphabetical order
                String temp = word[j];
                word[j] = word[j - 1];
                word[j - 1] = temp;
                // Continue to decrease until the very last word 
                j--;
            }
        }
    }
}
