/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A3Q7 {
//create countsort method

    public int[] CountSort(int[] array) {
//new array for tracking numbers
        int[] tracker = new int[101];
//create for loop to add to the tracker array
        for (int i = 0; i < array.length; i++) {
            //integer n is the value of the spot in the original array
            int n = array[i];
            //add 1 to that position in the tracker array
            tracker[n]++;
        }

        //create temporary variable
        int temp = 0;
        //create for loop to go through the array
        for (int i = 0; temp < array.length; i++) {
            //while the tracker arrays value is less than 0
            while (tracker[i] > 0) {
                //temporary spot in the array is 1 more than the loop
                array[temp] = i + 1;
                //add one to the temp
                temp++;
                //subtract 1 from the trackers value
                tracker[i]--;
            }
        }
        //return original array
        return array;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new test to test method
        A3Q7 test = new A3Q7();
        //create array of 20 positions
        int array[] = new int[20];
        //insert random numbers into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        //test the array
        test.CountSort(array);
        //print out the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
