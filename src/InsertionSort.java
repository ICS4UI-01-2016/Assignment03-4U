/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Set of numbers 
        int n[] = {3, 4, 6, 7, 8, 1, 9, 2};

        //initializer for calling a method 
        InsertionSort test = new InsertionSort();

        // a loop that spits out all numbers sorted 
        for (int i = 0; i < n.length; i++) {
            //calls the method
            test.insertionsSort(n);
            //prints out all the numbers
            System.out.println(n[i]);
        }
    }

    //insertionSort method 
    public void insertionsSort(int[] n) {
        //a for loop that is needed assign a number to each spot through conversion of int i to j
        for (int i = 1; i < n.length; i++) {
            //a variable that takes the same value as i so that i is not affected by the for loop below, it's also what changes spot
            int j = i;
            //a while loop designed so that it compares the current number to the previous number, then stops operating when j is exhausted
            while (j > 0 && n[j - 1] < n[j]) {
                //stores the current number as temporary
                int temp = n[j];
                //if the first number is bigger than second number, swap them 
                n[j] = n[j - 1];
                //same thing, except this first number takes the big number saved as a temp (to avoid mis swaping)
                n[j - 1] = temp;
                //goes down the list of numbers
                j--;

            }
        }

    }
}
