/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A3Q8 {

    public void insertionSort(String[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            while (j > 0 && n.compareTo([j-1)) {
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
        // 
    }
}
