/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A3Q8 {

    // Insertion Sort Method 
    public void insertionSort(String[] str) {
        // The Loop runs through each position in the array 
        for (int i = 1; i < str.length; i++) {
            // The Loop runs a comparision between pairs of strings 
            for (int a = i; a > 0 && str[a].toLowerCase().compareTo(str[a - 1].toLowerCase()) < 0; a--) {
                // Stores the second string value in a temporary string 
                String tempInteger = str[a];
                // Changes the value of the second string with the first string 
                str[a] = str[a - 1];
                // Changes the value of the first string with the stored values 
                str[a - 1] = tempInteger;
            }
        }
    }

    public static void main(String[] args) {
        A3Q8 test = new A3Q8();

        String[] str = {"Waterloo", "Toronto", "Dance", "Array", "Car", "Accurate", "Babe"};

        test.insertionSort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
