/*
 * Write the Java method for Counting Sort that will take an array as a parameter 
 * and sort it using this method of sorting. 
 * We will assume that only the numbers from 0 to 100 will be in the array. 
 */

/**
 *
 * @author richj0985
 */
public class A3Q7 {

    // Method for the sorting method of Insertion Sort
    // Counting Sort basically preforms this by first looping through the array of n 
    // counting the number of times each number is repeated placing these values in a tracker array. 
    // Once that it is accomplished it then loops through the tracker filling each position 
    // within the array of n with the numbers counted in the tracker. 
    // Finally, the array is sorted from ascending order and can be outputted
    public void countingSort(int[] n){
        
        // New array that stores the number of times a value is within the n array
        int [] tracker = new int [101];
        
        // Loop through the n array until it has acceeded the length, counting and
        // placing the values in the cooresponding position in the tracker array
        for(int i = 0; i < n.length; i++){
           
           // Increase the value
           tracker[n[i]] ++;
        }
        
        // Identify the position within the n array that a new value is going to be placed in
        int spotInArray = 0;
        
        // Now that we have the tracker array, it tells if that spotInTracker
        // position is in the sorted array and how many times one after
        // another in the sorted array.   This technique allows you to 
        // create the sorted array 2 passes of the array O(2*n)
        for(int spotInTracker = 0; spotInTracker < tracker.length; spotInTracker++){
                
            // If the index is less than the value in that secific position in the tracker,
            // than loop through that specific spot in the tracker array. 
            // When doing so, this adds the position that it is at in the tracker 
            // into the new array of n.
            // Continues to add this number into a new spot until the
            // array has filled this value in the correct number of positions in the new array
            for (int i = 0; i < tracker[spotInTracker]; i++) {
                
                // Placing the number at which it is at in the tracker into the new array
                n[spotInArray] = spotInTracker;
                
                // Moving onto the next position in the new array
                spotInArray ++;
            }
        }
    }
    
    // Main method that inputs a series of numbers from an array to the method
    // and outputs the ordered array of numbers
    public static void main(String[] args) {
        // Tests file
        A3Q7 test = new A3Q7();
        
        // A randomized array of numbers out of order
        int [] n = {2, 2, 3, 3, 1, 1, 4, 4, 5, 5};
        
        // Call on the method of insertion sort with the perimeter as the array of n
        test.countingSort(n);
        
        // Output the sorted array of n
        for(int i = 0; i < n.length; i ++){
            System.out.print(n[i] + " ");
        }
    }
}
