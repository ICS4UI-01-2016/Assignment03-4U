/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A3Q6 {
    
    public void insertionSort(int[] n) {    // the method that will preform the sort 
        for (int i = 1; i < n.length; i++) {    // for loop -- do the following 
            int j = i;  // the integer j is equal to i 
            while (j > 0 && n[j - 1] < n[j]) {  // the insertion sort code 
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {    // main method 
        
        A3Q6 sort = new A3Q6();
        int[] n = {2, 4, 5, 6, 32, 76, 23, 34, 54, 754, 42, 426, 3};    // the list of numbers that will be sorted
        sort.insertionSort(n);  // preforming the sort 
        
        for (int i = 0; i < n.length; i++) {    // for loop -- do the following 
            System.out.print("" + n[i] + " | ");    // output the numbers in descending order

        }
    }
}