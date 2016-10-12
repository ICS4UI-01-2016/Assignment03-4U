/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A3Q8 {

    // method that sorts words alphabetically
    public void insertionSort(String[] words) {
        // loop through the spots in the array
        for (int i = 1; i < words.length; i++) {
            // create a variable so that we can change the places of words without affecting the for loop
            int j = i;
            // switch the places if the place before the one we're looking at comes after it in the alphabet
            while (j > 0 && words[j - 1].compareTo(words[j]) > 0) {
                // create a variable to store the word in the place we are looking at
                String temp = words[j];
                // swap the places of the words
                words[j] = words[j - 1];
                words[j - 1] = temp;
                j--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test the method
        String[] words = {"hello", "dog", "cart", "bird", "zoo", "alphabet"};
        A3Q8 test = new A3Q8();
        test.insertionSort(words);
        // loop through the array
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
