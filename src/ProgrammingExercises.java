/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class ProgrammingExercises {

    //void method that proccesses an array
    public void insertionSort(int[] n) {
        //start at spot "2" in the array
        for (int i = 1; i < n.length; i++) {
            //temporary integer
            int j = i;
            //compare side by side integers-check if 'right' integer is greater than 'left' integer (sort from largest to smallest)
            while (j > 0 && n[j - 1] < n[j]) {
                //temporary integer 
                int temp = n[j];
                //swap numbers if right int is greater than left integer until appropriate spot is reached (determined by while loop)
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }

    //void method that takes in and sorts array using counting sort
    public void countingSort(int[] n) {
        //create tracker array ranging from 0-100
        int[] tracker = new int[101];
        //for loop goes through all elements of array that needs to be sorted
        for (int i = 0; i < n.length; i++) {
            //each time number is checked, traker array adds 1 to appropriate space in tracker array
            tracker[n[i]]++;
        }
        //for loop goes through tracker array to output ordered numbers starting at 0
        for (int i = 0; i < tracker.length; i++) {
            //if a spot in the tracker array is 0, do not output anything (no numbers in this index found)
            if (tracker[i] != 0) {
                //output number as many times as in occurs
                for (int j = 0; j < tracker[i]; j++) {
                    //output number at tracker[i] as many ties as it occurs
                    System.out.println(i);

                }
            }

        }

    }

    //array that takes array of strings and sorts using insertion sort
    public void stringSort(String[] n) {
        //for loop goes through the array
        for (int i = 0; i < n.length; i++) {
            // Create a new intereger and set it equal to i
            int s = i;
            // If the string character is later in the alphabet than next string character
            while (s > 0 && n[s - 1].compareTo(n[s]) > 0) {
                // Switch the characters to alpha order
                String temp = n[s];
                n[s] = n[s - 1];
                n[s - 1] = temp;
                //decrease s until last string until end of array is reached
                s--;
            }
        }
        //output elements of array in alpha order
        for (int i = 0; i < n.length; i++) {
            //output array element
            System.out.println(n[i]);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enable main class to access methods
        ProgrammingExercises test = new ProgrammingExercises();
        //create and populate arrays
        int[] TestArray = {5, 5, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 0, 0, 6, 6, 3, 4, 100};
        String[] stringArray = {"hello", "thomas", "computer", "wallet", "phone", "zipper", "alphabet"};
        //call on insertionSort method
        test.insertionSort(TestArray);   
        //call on countingSort method
        test.countingSort(TestArray);
        //call on stringSort method
        test.stringSort(stringArray);

    }

}
