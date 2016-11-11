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
        // looks through the letters in the word
        for(int i=0; i<word.length; i++){
            int j = i;
            while(j > 0 && word[j].compareTo(word[j-1]) < 0){
                String temp = word[j];
                word[j] = word[j-1];
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
