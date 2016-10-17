/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A3Q8 {

    public String[] insertionSort(String[] n) {
        //loops through array
        for (int i = 1; i < n.length; i++) {
            String s1 = n[i - 1];
            String s2 = n[i];
            
            //sorts array
            while(i > 0 && s1.compareToIgnoreCase(s2) > 0){
                String temp = n[i];
                n[i] = n[i - 1];
                n[i - 1] = temp;
                i--;
            }
        }
        
        //return array
        return n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create method
        A3Q8 test = new A3Q8();

        //make array for program to sort
        String[] n = {"e", "a", "c", "d", "b"};

        //call up method
        test.insertionSort(n);

        //go through array and output letters
        for(int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
