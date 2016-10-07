/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A3 {

    /**
     * @param args the command line arguments
     */
    public void Insertion(int[] n){
        for(int i = 1; i < n.length; i++){
            int j = i;
            while(j > 0 && n[j] > n[j - 1]){
                int temp = n[j - 1];
                n[j - 1] = n[j];
                n[j] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}
