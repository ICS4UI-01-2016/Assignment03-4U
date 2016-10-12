/*
 * Rewrite insertion sort so that it arranges values of an array in descending order
 */

/**
 *
 * @author richj0985
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    
    // Method for the sorting method of Insertion Sort
    // 
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
    
    // Main method that inputs a series of numbers from an array to the method
    // and outputs the ordered array of numbers
    public static void main(String[] args) {
        // Tests file
        A3Q6 test = new A3Q6();
        
        // A randomized array of numbers out of ourder
        int [] n = {10, 8, 4, 9, 1, 3, 2, 7, 5, 6};
        
        // call on the method of insertion sort with the perimeter as the array of n
        test.insertionSort(n);
        
        // output the sorted array of n
        for(int i = 0; i < n.length; i ++){
            System.out.print(n[i] + " ");
        }
    }
}
