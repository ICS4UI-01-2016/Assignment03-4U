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
    // Insertion sort will sort the array one number at a time. 
    // It essentially picks up the number and shuffles it down the array until it finds 
    // the appropriate spot in the array
    public void insertionSort(int[] n){
       // Use loop to count through the array of n
        for(int i = 1; i < n.length; i++)
        {
            // Store the index value within a new variable of j 
            int j = i;
            
            // Check to make sure the value of j is greater than 0
            // Determine if the position of j value is larger than the j value 
            // one spot earlier in the array
            while(j>0 && n[j-1] < n[j])
            {
                // if both are true swap the values into the opposite positions
                // by storing a tempory value, then substiting the two values using the temp
                int temp = n[j];
                n[j] = n[j-1];
                n[j-1] = temp;
                
                // Continue to decrease the value of j checking the positions before until the very last element
                j--;
            }
        }
    }
    
    // Main method that inputs a series of numbers from an array to the method
    // and outputs the ordered array of numbers
    public static void main(String[] args) {
        // Tests file
        A3Q6 test = new A3Q6();
        
        // A randomized array of numbers out of order
        int [] n = {10, 8, 4, 9, 1, 3, 2, 7, 5, 6};
        
        // Call on the method of insertion sort with the perimeter as the array of n
        test.insertionSort(n);
        
        // Output the sorted array of n
        for(int i = 0; i < n.length; i ++){
            System.out.print(n[i] + " ");
        }
    }
}
