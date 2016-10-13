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

    /**
     * @param args the command line arguments
     */
    
    // Method for the sorting method of Insertion Sort
    // Counting Sort basically preforms this by first loopuing through the array of n 
    // counting the number of times each number is repeated placing these values in a tracker array. 
    // Once that it is accomplished it then loops through the tracker filling each position 
    // within the array of n with the numbers counted in the tracker. 
    // Finally, the array is sorted from ascending order and can be outputted
    public void countingSort(int[] n){
        
        // New array that stores the number of times a value is within the n array
        int [] tracker = new int [101];
        
        // Loop through the n array until it has acceeded the length, counting
        // placing the values in the coorisponding position in the tracker array
        for(int i = 0; i < n.length; i++){
           
           // Increase the value
           tracker[n[i]] ++;
        }
        
        int spotInArray = 0;
        
        for(int spotInTracker = 0; spotInTracker < tracker.length; spotInTracker++){
            
            int amountOfNum = tracker[spotInTracker];
            
            if (amountOfNum != 0) {
                
                for (int i = 0; i < amountOfNum; i++) {
                    n[spotInArray] = spotInTracker;
                    spotInArray ++;
                    System.out.println("spotInTracker: " + spotInTracker);
                    System.out.println("spotInArray: " + spotInArray);
                    System.out.println("i: " + i);
                    System.out.println("amountOfNum: " + amountOfNum);
                    System.out.println(" ");
                }
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
