/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A3Q7 {
    
    public static int[] sort(int[] array) {
        
        int[] aux = new int[array.length];
        
        int min = array[0];
        int max = array[100];
        for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        } else if (array[i] > max) {
            max = array[i];
        }
       }
        
        int[] counts = new int[max - min + 1];
        
        for (int i = 0;  i < array.length; i++) {
        counts[array[i] - min]++;
    }
        
        counts[0]--;
    for (int i = 1; i < counts.length; i++) {
      counts[i] = counts[i] + counts[i-1];
    }
    
     for (int i = array.length - 1; i >= 0; i--) {
        aux[counts[array[i] - min]--] = array[i];
    }
        return array;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}
