/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A3Q7 {

    public static void countingSort(int[] n){
        // make array the size of 101
        int[] tracker = new int[101];
        // look through the list of numbers
        for(int i = 0; i < n.length; i++){
            int value = n[i];
            tracker[value]++;
        }
        // set number count to 0
        int number = 0;
        // look through list of possible numbers
        for(int i = 0; i < tracker.length; i++){
            for(int a = 0; tracker[i] > a; a++){
                n[number] = i;
                number++;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        int[] n = new int[4];
        n[0] = 3;
        n[1] = 3;
        n[2] = 8;
        n[3] = 10;
        test.countingSort(n);
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}
