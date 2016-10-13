/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A3Q8 {

    public void insertionSort(String[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            while (j > 0 && n[j - 1].compareToIgnoreCase(n[j]) > 0) {
                String temp = n[j];
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
        A3Q8 test = new A3Q8();
        String[] n = {"Natalie", "cat", "Lauren", "Geo", "dog", "Gildaroy", "Lockhart"};
        test.insertionSort(n);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}