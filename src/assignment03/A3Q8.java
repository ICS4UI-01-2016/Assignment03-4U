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
    public int compareTo(String[] words){
        for(int i = 0; i < words.length; i++)
        {
            int j = i;
            while(j>0 && this.char < words[j])
            {
                String temp = words[j];
                words[j] = words[j-1];
                words[j-1] = temp;
                j--;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q8 test = new A3Q8();
        String[] words = {"apple","corn","bee","pop"};
        test.compareTo(words);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}