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
            tracker[n[i]]++;
        }

        // add array space value to array per amt. in array                      -- FIX
        int pos = 0;
        for (int i = 0; i < tracker.length; i++) {
            // goes through each array spot until it is at 0
            while (tracker[i] > 0) {
                n[pos] = i;                                             //  -- difference between array spot and array value
                tracker[i]--;
                // go to the next spot
                pos++;
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
        System.out.println("Unsorted");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        test.countingSort(n);
        // Print out array using for loop
        System.out.println("");
        System.out.println("Sorted");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
