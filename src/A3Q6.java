/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A3Q6 {

    // method that sorts numbers in descending order
    public void insertionSort(int[] n) {
        // loop through the spots in the array
        for (int i = 1; i < n.length; i++) {
            // create a variable so that we can change the places of numbers without affecting the for loop
            int j = i;
            // switch the places if the place before the one we're looking at is smaller 
            while (j > 0 && n[j - 1] < n[j]) {
                // create a variable to store the number in the place we are looking at
                int temp = n[j];
                // swap the places of the numbers 
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test the method
        int[] n = {3, 2, 9, 8, 6, 10};
        A3Q6 test = new A3Q6();
        test.insertionSort(n);
        // loop through the array
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
