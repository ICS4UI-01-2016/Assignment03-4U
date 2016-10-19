/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Joudrey
 */
public class A3Q8 {

    public String[] insertionSort(String[] n) {
        //method created to use insertion sort to sort strings
        for (int i = 1; i < n.length; i++) {
            //add one each time the loop completes up until it reaches the length of the array
            int j = i;
            //created int j to equal
            String stringA = n[i - 1];
            //create a string to store the string at position i-1 in the array
            String stringB = n[i];
            //create a string to store the string at position i in the array
            while (j > 0 && stringA.compareToIgnoreCase(stringB) > 0) {
                //enter while loop when j is greater than zero or the first character
                //of the stringA in the array is after the first character
                //of stringB in the array
                String temp = n[j];
                //create a temporary string to represent the string at position j in array n
                n[j] = n[j - 1];
                //set the string at position j-1 to the value for position j in the array
                n[j - 1] = temp;
                //set the value of position j-1 in the string to the value of temp
                j--;
                //subtract 1 from j
                stringA = n[j - 1];
                //set stringA to the value of position j-1 of the string
                stringB = n[j];
                //set stringB to the value of position j of the string
            }
        }
        return n;
        //return array n
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q8 test = new A3Q8();
        String intial[] = {"coke", "hose", "joke", "zeee", "gee"};
        test.insertionSort(intial);
        for (int i = 0; i < intial.length; i++) {
            System.out.println(intial[i]);
        }
    }

}
