/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class A3Q7 {

    public void countingSort(int[] n) {
        //create array with spots 0-100 (101)
        int[] tracker = new int[101];

        
        for (int i = 0; i < n.length; i++) {
            tracker[n[i]]++;
        }

        //create int for position in tracker
        int pos = 0;
        int i = 0;
        while (pos < tracker.length) {
            while (tracker[pos] > 0) {
                n[i] = pos;
                tracker[pos]--;
                i++;
            }
            if (tracker[pos] == 0) {
                    pos++;
                }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create array with spots 1 - 100 (101)
        A3Q7 test = new A3Q7();

        int[] n = new int[20];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 101);
        }
        
        //prints out array thats unsorted
        System.out.println("Unsorted:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
       
        System.out.println("");
        
        //print out array thats sorted
        test.countingSort(n);     
        System.out.println("Sorted:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

    }
}
