/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A3Q8 {

    /**
     * Create Insertion sort method
     *
     * @param words in alphabetical order
     */
    public void insertionSort(String[] words) {
        //make a for loop to go through each word
        for (int i = 0; i < words.length; i++) {
            //make j equal to the number of the loop 
            int j = i;
            //while j is more than 0, and while compare to is returning a 
            //positive integer run the loop
            while (j > 0 && words[j - 1].compareToIgnoreCase(words[j]) > 0) {
                //make a temporary string to equal the word
                String temp = words[j];
                //make the word equal the word before
                words[j] = words[j - 1];
                //set the word before to equal the temporary
                words[j - 1] = temp;
                //subtract 1 from j
                j--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a test
        A3Q8 test = new A3Q8();
        //enter words to sort in an array
        String[] list = {"house", "mouse", "people", "order", "our", "patties", "apples"};
        //test the method
        test.insertionSort(list);
        //run a loop to print out the array
        for (int i = 0; i < list.length; i++) {
            //print out the sorted list
            System.out.println(list[i]);
        }

    }
}
