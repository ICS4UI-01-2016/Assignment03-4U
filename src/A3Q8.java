/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A3Q8 {
    
    public String[] sort(String[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            String first1 = n[i - 1];
            String first2 = n[i];
            while (j > 0 && first1.compareToIgnoreCase(first2) > 0){
                String temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
                first1 = n[j - 1];
                first2 = n[j];
            }
        }
        return n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
