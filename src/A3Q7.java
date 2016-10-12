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
        int[] tracker = new int[101];
        for(int i = 0; i < n.length; i++){
            int value = n[i];
            tracker[value]++;
        }
        int count = 0;
        for(int i = 0; i < tracker.length; i++){
            for(int a = 0; tracker[i] > a; a++){
                n[count] = i;
                count++;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
