/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A3Q7 {

    // Counting Sort Method 
    public void countingSort(int[] number) {

        // Creation of tracker array 
        int[] track = new int[101];
        // Variable used to set the position of each value into the array 
        int count = 0;
        // The loop uses the position of the array
        for (int i = 0; i < number.length; i++) {
            // Variable stores the value in that position 
            int value = number[i];
            // Increases the position value by one in the array 
            track[value]++;
        }
        // The loop uses each position in the tracker array 
        for (int i = 0; i < track.length; i++) {
            // The loop runs all stored values in the tracker array 
            for (int a = 0; track[i] > a; a++) {
                // Assigns the array a sorted number 
                number[count] = i;
                // Continues to count up along the list of values in the array 
                count++;
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();

        int[] number = {0, 1, 34, 23, 78, 90, 40, 0, 78};

        test.countingSort(number);
        System.out.println("The numbers sorted in ascending order:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }



    }
}
