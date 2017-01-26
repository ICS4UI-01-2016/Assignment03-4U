/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    public void alphWordSort(String[] word) {

        for (int i = 0; i < word.length; i++) {
            //set x to 1
            int x = i;
            //while statement x word j are both more than 0
            while (x > 0 && word[x - 1].compareToIgnoreCase(word[x]) > 0) {
                //temp string is equal to the array
                String temp = word[x];
                //the array is equal to word[j-1]
                word[x] = word[x - 1];
                //the word[j-1] is equal to the temp string
                word[x - 1] = temp;
                x--;
            }
        }
    }

    public static void main(String[] args) {

        A3Q8 test = new A3Q8();

        //words that are sorted
        String[] wordList = {"smite", "kalamityj", "petey", "cake", "anguish", "tahuti"};

        for (int i = 0; i < wordList.length; i++) {
            //run method
            test.alphWordSort(wordList);
            //output sorted words
            System.out.println(wordList[i]);
        }
    }
}
