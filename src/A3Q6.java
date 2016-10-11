/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    
    public void insertionSort(int[] n){
       for(int i = 1; i < n.length; i++)
       {
          int j = i;
          while(j>0 && n[j-1] < n[j])
          {
             int temp = n[j];
             n[j] = n[j-1];
             n[j-1] = temp;
             j--;
          }
       }
    }
    
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        int [] n = {10, 8, 4, 9, 1, 3, 2, 7, 5, 6};
        test.insertionSort(n);
        for(int i = 0; i < n.length; i ++){
            System.out.print(n[i] + " ");
        }
    }
}
