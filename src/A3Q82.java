/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A3Q82 {
    
     public void insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            while (j > 0 && n[j - 1] > n[j]) {                                  // -- go through letters, not numbers. if compareTo string returns 0,or negative dependant on order
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
        // TODO code application logic here
         String[] letters = {"a", "c", "l", "q", "z", "t", "v"};

        //necessary for calling a method later
        A3Q8 test = new A3Q8();
        System.out.print("The sorted list of strings: ");
        //a for loop that prints out the sorted string list
        for (int i = 0; i < letters.length; i++) {
            //calls the method
            test.insertionSort(letters);
            System.out.print(letters[i]+ ",");
        }
        //separates the list of strings from BUILD SUCCESSFUL
        System.out.println("");
    }
}
