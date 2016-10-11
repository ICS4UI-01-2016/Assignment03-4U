/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

/**
 *
 * @author fostp4040
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public void insertionSort(int[] n){
        for(int i = 0; i < n.length; i++)
        {
            int j = i;
            while(j>0 && n[j-1] < n[j])
            {
                int temp = n[j];
                n[j] = n[j-1];
                n[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q6 test = new A3Q6();
        int[] n = {4,8,23,9,10};
        test.insertionSort(n);
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}