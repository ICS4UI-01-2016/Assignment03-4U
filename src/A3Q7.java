/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    
    public void countingSort(int[] n){
        for(int i = 1; i < n.length; i++)
       {
           int j = i;
       }
    }
    
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        int [] n = {2, 2, 3, 3, 1, 1, 4, 4, 5, 5};
        test.countingSort(n);
        System.out.println(n[0] + "," + n[1] + "," + n[2] + "," + n[3] + "," + n[4] + "," + n[5] + "," + n[6] + "," + n[7] + "," + n[8] + "," + n[9]);
    }
}
