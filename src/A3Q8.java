/*
 * Write a version of insertion sort that will take in an array of Strings and 
 * place the in Alphabetical Order. 
 */

/**
 *
 * @author Jon
 */
public class A3Q8 {

     public void alphebetical(String[] l){
        // move through the array from  first element to the end
        // ordering all elements in the array up to that point in the array
        for(int i = 1; i < l.length; i++){
            // All prior items in the array up to point j-1 are in order.
            // Now put this new array item I in the correct order
            // position in the items 0-I by swapping elements 
            // as far back as needed and up to the beginning of the array 
            // to ensure items 0-I are now in sorted order.   
            int j = i;
            while(j > 0 && l[j-1].toLowerCase().compareTo(l[j].toLowerCase()) > 0){
                // swap the J-1 and J array values to put the Jth item in 
                // correct order relative to each other.
                // Continue swapping array items for item J until it is 
                // found that the J item doesn't need to be swapped at 
                // since all items earlier in the array are already in order
                String temp = l[j];
                l[j] = l[j-1];
                l[j-1] = temp;
                j--;
            }
        }
    }
    
    // Main method that inputs a series of words from an array to the method
    // and outputs the ordered array of words
    public static void main(String[] args) {
        // Tests file
        A3Q8 test = new A3Q8();
        
        // A randomized array of words out of order
        String [] l = {"dog", "cat", "ant", "bee"};
        
        // Call on the method of insertion sort with the perimeter as the array of n
        test.alphebetical(l);
        
        // Output the sorted array of n
        for(int i = 0; i < l.length; i ++){
            System.out.print(l[i] + " ");
        }
    }
}
