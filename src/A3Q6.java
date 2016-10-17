/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A3Q6 {

    public void insertionSort(int[] n) {
    //for loop makes sure program loops the correct amount of times so array is sorted properly
        for(int i = 1; i < n.length; i++){
      int j = i;
      
    //while loop actually sorts the array
      while(j>0 && n[j-1] < n[j])
      {
         int temp = n[j];
         n[j] = n[j-1];
         n[j-1] = temp;
         j--;
      }
   }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create method
        A3Q6 test = new A3Q6();
       
       //make an array for the method to sort
        int[] n = {4, 2, 1, 3, 5};
        test.insertionSort(n);
        
        //go through array and output numbers
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}
