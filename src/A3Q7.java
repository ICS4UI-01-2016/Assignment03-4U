/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A3Q7 {
    
    public void countingSort(int[] n) { // the method that will preform the counting sort 
        
        int[] tracker = new int[101];   // the integer will have 101 positions 
        
        for (int i = 0; i < n.length; i++) {    // for loop -- do the following 
            tracker[n[i]]++;  
        }
        
        int x = 0;  // the integer is equal to 0
        
        for (int i = 0; i < tracker.length; i++) {  // for loop -- do the following 
           
            while (tracker[i] != 0) {   // while the array is not equal to 0 do the following 
                n[x] = i;   // the array for x is equal to i
                x++;
                tracker[i]--;
            }
        }
    }
    
    public static void main(String[] args) {    // main method 
        
        A3Q7 test = new A3Q7();
        
        int[] n = {12, 10, 26, 33, 39, 73, 12, 25, 33, 10, 32, 23, 43, 53, 65, 24}; // the numbers that will be sorted
        
        for (int i = 0; i < n.length; i++) {    // for loop -- do the following
            test.countingSort(n);   // preform the sort 
            System.out.println(n[i]);   // output the sorted numbers 
        }
    }
}
