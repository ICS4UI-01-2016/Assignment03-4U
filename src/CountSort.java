
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
        int[] n = {56,65,44,65,98,44};
        CountSort test = new CountSort();
        
     
              test.countSort(n);
        
        
      
        
    }
    public void countSort(int[]n){
        int[]tracker = new int[101];
        
        for (int i = 0; i < n.length; i++) {
            
            int number = n[i];
            int number2 = tracker[number];
           
            
            
             for (int j = 0; j < 1; j++) {
             tracker[number]++;
        }
             
            }
        
        
        for (int j = 0; j < tracker.length; j++) {
            if(tracker[j] != 0){
                 System.out.println("Number " + j + " and " + tracker[j]);
                 
            }
    }
    
}
}
