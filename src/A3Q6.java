/*
 * Rewrite insertion sort so that it arranges values of an array in descending order
 */

/**
 *
 * @author richj0985
 */
public class A3Q6 {

    // Method for the sorting method of Insertion Sort
    // Insertion sort will sort the array one number at a time. 
    // It essentially picks up the number and shuffles it down the array until it finds 
    // the appropriate spot in the array
    public void insertionSort(int[] n){
        // move through the array from  first element to the end
        // ordering all elements in the array up to that point in the array
          for(int i = 1; i < n.length; i++)
        {
            // All prior items in the array up to point j-1 are in order.
            // Now put this new array item I in the correct order
            // position in the items 0-I by swapping elements 
            // as far back as needed and up to the beginning of the array 
            // to ensure items 0-I are now in sorted order.   
            int j = i;
            while(j>0 && n[j-1] < n[j])
            {
                // swap the J-1 and J array values to put the Jth item in 
                // correct order relative to each other.
                // Continue swapping array items for item J until it is 
                // found that the J item doesn't need to be swapped  
                // since all items earlier in the array are already in order
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
        
        // A randomized array of numbers out of order
        int [] n = {6, 8, 4, 9, 1, 3, 2, 7, 5, 10};
        
        // Call on the method of insertion sort with the perimeter as the array of n
        test.insertionSort(n);
        
        // Output the sorted array of n
        for(int i = 0; i < n.length; i ++){
            System.out.print(n[i] + " ");
        }
    }
}
