/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munta
 */
public class a3q8 {

    public String[] alphasort(String[] n) {

        // For loop goes through enter set of elements 
        for (int i = 1; i < n.length; i++) {
            //set an integer equal to the postion in the array(i)
            int t = i;
            String test = n[i - 1];//this is the first string being compared,in soit i-1
            String test2 = n[i];//second string that is being compared in spot i

            //loop while the value of j is greater than 0
            while (t > 0 && test.compareToIgnoreCase(test2) > 0) {
                String temp = n[t]; //string is used to store value of n at spot t
                n[t] = n[t - 1]; // spot n at t is swaped witht the value before it 
                n[t - 1] = temp; // the first term is replaced wiht the temporary value
                t--; //subtarct one value from t
                test = n[t - 1]; //change the value of the first word 
                test2 = n[t]; //change the value for the second word 

            }

        }
        //return the the array (Alphabatical order)
        return n;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a new test object 
        a3q8 test = new a3q8();

        //create an array test array with words
        String[] array = {"air", "bad", "cat", "pear", "summer", "sixteen", "drake", "ovofest"};

        //run the sorting method
        test.alphasort(array);

        //the loop prints the word to the screen untill there are none left
        //print words
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

}
