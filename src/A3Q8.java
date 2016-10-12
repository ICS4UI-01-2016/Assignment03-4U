/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A3Q8 {

    public String[] sort(String[] n) {
        //loop while the value of i is less than that of the length of the array
        for (int i = 1; i < n.length; i++) { //add one to i ever time the loop completes
            int j = i; //the int of j is the same as i
            String frst1 = n[i - 1]; //the first string being compared is at the place in the array equal to one less than i
            String frst2 = n[i]; //the value of the second string being compared is 
            while (j > 0 && frst1.compareToIgnoreCase(frst2) > 0) { //loop while the value of j is greater than 0 and the first letter in the first word comes after the first letter in the second word in the alphabet
                String temp = n[j]; //temporary string is the value of the array at the spot j
                n[j] = n[j - 1]; // swap the value of n at j and the place before it
                n[j - 1] = temp; // replace the value of the first term with the temporary value previously recorded
                j--; //take away one value from j
                frst1 = n[j - 1]; //change the value of the first word being compared
                frst2 = n[j]; //change the value for the second word being compared
            }
        }
        return n; //return the array back to the method
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create a new A3Q7 object to use to call
        A3Q8 test = new A3Q8();

        //create an array with the following numbers
        String[] array = {"apple", "pear", "purple", "computer", "iPhone", "seventeen", "chocolate"};

        //run the sorting method
        test.sort(array);

        //while the value of i is less than the length of the array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); //output the current value in the array
        }
    }
}
