
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A3Q6 {

    public static void insertionSort(int[] n) {
        // for loop to put a number on each spot
        for (int i = 1; i < n.length; i++) {
            // variable to store the change in spot
            int j = i;
            // main loop for swapping number
            while (j > 0 && n[j] > n[j - 1]) {
                // temporary variable
                int temp = n[j];
                // swaps the first number with the second if it is bigger
                n[j] = n[j - 1];
                // first number takes the temp number
                n[j - 1] = temp;
                // goes down the list of numbers
                j--;
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        int[] n = new int[4];
        n[0] = 3;
        n[1] = 9;
        n[2] = 4;
        n[3] = 2;
        test.insertionSort(n);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
