/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     *///performs counting sort
     public void countingSort(int[] n) {  
        
        //array has 101 positions
        int[] track = new int[101];    
        
        for (int i = 0; i < n.length; i++) {     
            track[n[i]]++;  
        }
        
        // set integer to zero
        int x = 0;  
        
        for (int i = 0; i < track.length; i++) {   
           
            // while the array is not equal to 0
            while (track[i] != 0) {    
                //array for x is equal to i
                n[x] = i;   
                x++;
                track[i]--;
            }
        }
    }
    
    public static void main(String[] args) {     
        
        A3Q7 test = new A3Q7();
        
        //numbers that are sorted
        int[] n = {10, 37, 28, 33, 42, 79, 19, 56, 87, 34, 35, 92, 4, 2, 64, 52}; 
        
        for (int i = 0; i < n.length; i++) {
            //tests sorting
            test.countingSort(n); 
            //prints out sorted numbers
            System.out.println(n[i]);    
        }
    }
}

