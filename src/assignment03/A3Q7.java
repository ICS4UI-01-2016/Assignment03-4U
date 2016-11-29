/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

/**
 *
 * @author fostp4040
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public void countingSort(int[] n){
        for(int i = 1; i < n.length; i++)
        {
            int j = i;
            while(j>0 && n[j-1] > n[j])
            {
                int temp = n[j];
                n[j] = n[j-1];
                n[j-1] = temp;
                j--;
                if (n[j-1]==n[j]){
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q7 test = new A3Q7();
        int[] n = {4,9,23,4,8,4,9,23,10,10,8,9,10};
        test.countingSort(n);
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}