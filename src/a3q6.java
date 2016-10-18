/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munta
 */
public class a3q6 {

    public void insertionSort(int[] n) {
        // For loop goes through enter set of elements 
        for (int i = 1; i < n.length; i++) {
            // Create a new integer and set it equal to i 
            int j = i;
            // if the number is greater than 0 and the smaller element if found before the biggerelement 
            while (j > 0 && n[j - 1] < n[j]) {
                //swap the to elements,to arrange them in deceding order
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new test object
        a3q6 test = new a3q6();
        //create new number array to test
        int[] array = {3, 5, 4, 8, 2, 9, 7,};
        //test array
        test.insertionSort(array);
        //for loop that prints numbers in array,untill there are no numbers left
        for (int i = 0; i < array.length; i++) {
            //print numbers
            System.out.println(array[i]);
        }

    }

}
