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
        //Set of numbers 
         int n[] = new int[5];
         n[0] = 0;
         n[1] = 2;
         n[2] = 43;
         n[3] = 5;
         n[4] = 77;
     
         //initializer for calling a method 
         InsertionSort test = new InsertionSort();
         
         // a loop that spits out all numbers sorted 
         for(int i = 0; i < n.length; i++){
             //calls the method
         test.insertionsSort(n);
         //prints out all the numbers
             System.out.println(n[i]);
         }
    }
    
    //insertionSort method 
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
