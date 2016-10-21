/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q8 {

    public String[] alphibetical(String[] n) {
        //loop while the value of i is less thanthe length of the array
        for (int i = 1; i < n.length; i++) {
             // make int j = int i
            int j = i;
            // campare the letter 1 less then i first
            String a1 = n[i - 1];
            //second letter being compared
            String a2 = n[i];
            //while j is less then 0 and the letter being compared to the one infront of it is more then 1
            while (j > 0 && a1.compareToIgnoreCase(a2) > 0) {
                //at the spot j temporary string
                String temp = n[j];
                //swap
                n[j] = n[j - 1];
                //replace the value with the temp one
                n[j - 1] = temp;
                //minus one off j
                j--;
                //change the value of the first word
                a1 = n[j - 1];
                //change value of the second
                a2 = n[j];
            }
        }
        //return 
        return n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //string array that will be sorted
        String[] let = {"a", "c", "l", "q", "r", "g", "j"};
        
        //new test
        Q8 test = new Q8();
        //test the array
        test.alphibetical(let);
        //for loop to loop through the array
        for (int i = 0; i < let.length; i++) {
            //print out the sorted array
            System.out.print(let[i] + " | ");
        }
    }
}
