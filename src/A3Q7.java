/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A3Q7 {

    public void countingSort(int[] n) {
        int[] tracker = new int[101];

        // go through n array and add 1 to each array spot
        for (int i = 0; i < n.length; i++) {
            if (n[i] == i) {
                tracker[i] = tracker[i] + 1;
            }
        }
        
        // add array space value to array per amt. in array                     -- FIX
        for (int i = 0; i < n.length; i++) {
            while (tracker[i] > 0) {
                n[i] = tracker[i];
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q7 test = new A3Q7();
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 101);
        }
        // Print out array using for loop
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
