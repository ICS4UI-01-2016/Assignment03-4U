/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A3Q8 {

    public void stringSort(String[] word) { // the method for sorting 

        for (int i = 0; i < word.length; i++) { // for loop -- do the following 
            int j = i;  // int j is equal to i
            while (j > 0 && word[j - 1].compareToIgnoreCase(word[j]) > 0) { // while statement (while j is more then 0 and word[j] is also more than 0) do the following       
                String temp = word[j];  // the string for temp is equal to the array of the words
                word[j] = word[j - 1];  // the array is equal to word[j-1]
                word[j - 1] = temp; // the word[j-1] is equal to the temporary string 
                j--;    // j-- 
            }
        }
    }
    
    public static void main(String[] args) {
        
        A3Q8 test = new A3Q8(); // creating a variable to use 
        
        String[] wordList = {"apple", "bone", "eater", "teeth", "peter", "pumpkin"};    // the words that will be sorted
        
        for (int i = 0; i < wordList.length; i++) { // for loop -- do the following 
            
            test.stringSort(wordList);  // run the method to sort the words
            
            System.out.println(wordList[i]);    // output the sorted words
        }
    }
}
