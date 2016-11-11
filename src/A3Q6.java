/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public void descendingSort(int[] n) {
        //make for loop to run through the array
        for (int i = 1; i < n.length; i++) {
            //make the integer p equal to the loop number
            int p = i;
            //while p is greater than 0 and the number before the p position 
            //i is less than the p position in the array
            while (p > 0 && n[p - 1] < n[p]) {
                //create a temporary variable and set it to the p position value
                int temp = n[p];
                // move the value to the spot before in the array
                n[p] = n[p - 1];
                //the spot before is now the temporary
                n[p - 1] = temp;
                //subtract 1 from p
                p--;
            }
        }
    }

    public static void main(String[] args) {
        //create a test to test the method
        A3Q6 test = new A3Q6();
        //fill an array with random numbers
        int n[] = {4, 7, 5, 1, 3, 9, 5, 3, 2};

        //sort the array
        test.descendingSort(n);
        //for loop to print out the sorted array
        for (int i = 0; i < n.length; i++) {
            //print the array position
            System.out.println(n[i] + ",");
        }
    }
}
