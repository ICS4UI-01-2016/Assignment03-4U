/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n[] = new int[5];
         n[0] = 0;
         n[1] = 2;
         n[2] = 4;
         n[3] = 5;
         n[4] = 10;
     
         InsertionSort test = new InsertionSort();
         for(int i = 0; i < 5; i++){
  
         test.insertionsSort(n);
             System.out.println(n[i]);
         }
    }
    
    public void insertionsSort(int[]n){
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
}
