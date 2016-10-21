/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q6 {

    public void insertionSort(int[] n) {



        //for loop that if i is greater then the array length
        for (int i = 1; i < n.length; i++) {
            //have j = i
            int j = i;
            //while j is greater then 0 and the first digit is greter the second 
            while (j > 0 && n[j - 1] < n[j]) {
                //temparary int
                int temp = n[j];
                //have the temp int swap
                n[j] = n[j - 1];
                //then have the previous number equal the temp int
                n[j - 1] = temp;
                //take away one value from j
                j--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //new test
        Q6 test = new Q6();
        //array for the numbers we will be sorting
        int[] n = {1, 23, 7, 21, 15, 9, 34};
        //test the sort
        test.insertionSort(n);
        //have the for loop loop through the array
        for (int i = 0; i < n.length; i++) {
            //print out the sorted array
            System.out.print(n[i] + " | ");
        }
    }
}
