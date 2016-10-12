
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
        //the list used for testing
        int[] n = {23, 65, 1, 65, 98, 1, 65, 0, 23, 0, 99, 54, 23, 75, 34, 75, 87, 34, 23, 88, 11, 64, 23, 75, 35, 72};
        //used for method calling 
        CountSort test = new CountSort();

        //first calls the method then with a for loop, prints out the sorted array
        test.countSort(n);
        System.out.print("The sorted list: ");
        for (int i = 0; i < n.length; i++) {  
            System.out.print(i == n.length-1 ? n[i] : n[i]+ ",");
        }
        //separates the BUILD SUCCESSFUL with the list 
        System.out.println("");

    }

    //a void method that doesn't return a value, used to sort our list
    public void countSort(int[] n) {
        //a tracker array that saves the amount of repeated specific values from 0-100 within the list 
        int[] tracker = new int[101];
        //an integer named keeper that is used to move from one slot to another during sorting 
        int keeper = 0;
        //a for loop that goes through list 
        for (int i = 0; i < n.length; i++) {
            //assigns number to each spot 
            int number = n[i];
            //adds one everytime it comes across a number within the list, essentially our counter
            tracker[number]++;

        }

        //a for loop same as one above, goes through the entire list of our tracker (including 0s)
        for (int j = 0; j < tracker.length; j++) {
            //an integer that stores a number from the list
            int looper = tracker[j];

            //only looks at numbers that exist within the list (meaning no 0s would be read)
            if (tracker[j] != 0) {
                //a for loop that is used to sort MULTIPLES of the same number accordingly
                for (int i = 0; i < looper; i++) {
                    //assigns an array the sorted number
                    n[keeper] = j;
                    //counts up, meaning moves on to the next slot (spot) in the list
                    keeper++;
                }
            }

        }

    }
}
