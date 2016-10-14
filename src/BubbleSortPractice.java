/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denis
 */
public class BubbleSortPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        int[] numbers = {10, 5, 3, 7, 2};
        //
        //        System.out.println("The original sequence:-\n    ");
        //        for (int i = 0; i < numbers.length; i++) {
        //            System.out.print(numbers[i] + ", ");
        //        }
        //        System.out.println();
        //    }
        //
        //    public static void bubbleSort(int[] n) {
        //        // Need a temporary storage area for when swapping a number is needed to occur
        //        int temp;
        //
        //        // BUBBLE SORT
        //        // Have the for loop go through until 
        //        for (int i = n.length - 1; i > 0; i--) {
        //            for (int j = 0; j < i; j++) {
        //                if (n[j] > n[j + 1]) {
        //                    // Swapping the two elements
        //                    // Set the first number into the temp variable
        //                    temp = n[i];
        //                    // Assign the first number the value of the second number
        //                    n[j] = n[j + 1];
        //                    // The second number then get the temp variable 
        //                    n[j + 1] = temp;
        //                }
        //            }
        //        }
        // Printing the answer
        System.out.println("The new sequence:-\n    ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ", ");
        }
        System.out.println();
    }

    public void bubbleSort(int[] n) {
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < end; i++) {
                if (n[i] > n[i + 1]) {
                    int temp = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
