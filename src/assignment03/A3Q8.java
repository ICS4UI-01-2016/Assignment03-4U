/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

/**
 *
 * @author fostp4040
 */
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    
    public void stringSort(String[] n){
        for(int i = 1; i < n.length; i++){
            int j = i;
            int string1= n[j].compareTo(n[j-1]);
            int string2= n[j-1].compareTo(n[j]);
            while(j>0 && string1 > string2){
                String temp = n[j];
                n[j] = n[j-1];
                n[j-1] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q8 test = new A3Q8();
        String[] words = {"apple","corn","bee","pop"};
        test.stringSort(words);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}