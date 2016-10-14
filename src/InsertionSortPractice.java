
import static SelectionSortPractice.printArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Denis
 */
public class InsertionSortPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 7, 2};
        // Print out the array
        printArray(numbers);
    }

    public void insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            // Keep track of the smaller number
            int j = i;
            while (j > 0 && n[j - 1] > n[j]) {
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }
    // Print the array

    public static void printArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);

        }
    }
}
