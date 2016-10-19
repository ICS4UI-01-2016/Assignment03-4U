/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Joudrey
 */
public class A3Q6 {

    public void insertionSort(int[] n) {
        //create the insertion sort method
        for (int i = 1; i < n.length; i++) {
            int j = i;
            //for int i, i must be less than the length, and i will grow by 1 each time j will be equal to i
            while (j > 0 && n[j - 1] < n[j]) {
                //while j is greater than 0, and the j corresponding value is greater than the value corresponding to j-1
                int temp = n[j];
                //temporary int 
                n[j] = n[j - 1];
                n[j - 1] = temp;
                //switch the j and j-1 values
                j--;
                //subtract 1 from j
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q6 test = new A3Q6();
        int[] testArray = {2, 19, 5, 10, 7};

        test.insertionSort(testArray);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }

    }

}
