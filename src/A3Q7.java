/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A3Q7 {

    public int[] sort(int[] n) {

        //create the array that will track how many of each number is in the original array
        int[] tracker = new int[101];

        //loop until the value of i is equal to the length of the array
        for (int i = 0; i < n.length; i++) {
            int temp = n[i]; //create a temporary integer that has the value of the current place in the array
            tracker[temp - 1] = tracker[temp - 1] + 1; //add one value to the spot in the tracker array
        }

        //create an integer with a value of 0
        int x = 0;

        //while the value of x is less than the length of the array
        for (int i = 0; x < n.length; i++) {
            while (tracker[i] > 0) { //while the value of the current place in the tracker is more than 0
                n[x] = i + 1; //input the value of i + 1 into the current spot being checked by the for loop in the array
                x++; //add one value to x
                tracker[i]--; //take away one value from the tracker array at the current spot
            }
        }
        //return the array back
        return n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create a new A3Q7 object to use to call
        A3Q7 test = new A3Q7();

        //create an array with the following numbers
        int[] array = {43, 23, 1, 54, 65, 76, 87, 34, 23, 5, 3, 100, 65, 53, 67, 76, 78, 98, 54, 65};

        //run the sorting method
        test.sort(array);

        //while the value of i is less than the length of the array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); //output the current value in the array
        }
    }
}
