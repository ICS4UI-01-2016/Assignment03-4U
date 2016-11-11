/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A3Q8 {

    public static void stringSort(String[] word){
        // for loop to put a word on each spot
        for(int i=0; i<word.length; i++){
            // variable to store the change in spot
            int j = i;
            // main loop for sawpping words based on their first letter
            while(j > 0 && word[j].compareTo(word[j-1]) < 0){
                // temporary variable
                String temp = word[j];
                // swaps the first word if its first letter comes before the first letter of second word
                word[j] = word[j-1];
                // swaps with temp
                word[j-1] = temp; 
            }
        }
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q8 test = new A3Q8();
        String[] word = {"sfhd", "gfjfg","hgfj"};
        test.stringSort(word);
        for(int i = 0; i < word.length; i++){
            System.out.println(word[i]);
        }
    }
}
