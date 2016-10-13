/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A3Q6 {

    public void insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
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
        A3Q6 test = new A3Q6();
        int[] n = {6, 8, 23, 9, 7, 5};
        test.insertionSort(n);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
