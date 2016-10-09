/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida Family
 */
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //the list of strings
        String[] words = {"Exodia", "Kevin", "Khaled", "Victor", "Arshbarsh", "Majed","Lamont"};

        //necessary for calling a method later
        A3Q8 test = new A3Q8();
        System.out.print("The sorted list of strings: ");
        //a for loop that prints out the sorted string list
        for (int i = 0; i < words.length; i++) {
            //calls the method
            test.insertionSort(words);
            System.out.print(words[i]+ ",");
        }
        //separates the list of strings from BUILD SUCCESSFUL
        System.out.println("");
    }

    //the method that sorts the strings all accordingly
    public void insertionSort(String[] words) {
        //a for loop that is needed assign word to each spot through conversion of j and i
        for (int i = 1; i < words.length; i++) {
            //a variable that takes the same value as i so that i is not affected by the for loop below
            int j = i;
            
            //a while loop that operates until j is 0 (exhausted), compares the string before and the current string
            while (j > 0 && words[j - 1].compareTo(words[j]) > words[j].compareTo(words[j])) {
                //stores the current string as temporary
                String temp = words[j];
                //if the first letter of the word comes before the first letter of second word, swap
                words[j] = words[j - 1];
                //same thing as before, instead this time it swaps with temp because the word is saved 
                words[j - 1] = temp;
                //j is minused overtime, meaning it's going through every spot
                j--;
            }

        }
    }

}
