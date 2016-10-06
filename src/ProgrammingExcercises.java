/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class ProgrammingExcercises {

    public void insertionSort(int[] n) {
        for (int i; 0 < n.length; i++) {
            int j = i;
            // While loop = if the number is greater than 0 and the number before that specific number is less than J
            // Swtich the integers!
            while (j > 0 && n[j - 1] < n[j]) {
                int temp = n[j];
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
        // TODO code application logic here
        // A3Q6
    }
}
