
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class CountSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] n = {56,1,56,3,43,72,0};
        CountSort test = new CountSort();
        
        for (int i = 0; i < n.length; i++) {
              test.countSort(n);
        System.out.println(n[i]);
        }
      
        
    }
    public void countSort(int[]n){
        int[]tracker = new int[101];
        int keeper = 0;
        for (int i = 0; i < n.length; i++) {
            
            int number = n[i];
            int number2 = tracker[number];
         
             tracker[number] = keeper + 1;
            
             System.out.println(tracker[56]);
            
           
            
        }
        
    }
}
