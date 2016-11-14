
import java.util.Scanner;

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
    //created a new method called "Insertion" that takes in one array (n)
    public void Insertion(int[] n) {
        //created a new for loop that loops until variable "i" is greater than the 
        //length of "n"
        for (int i = 1; i < n.length; i++) {
            int j = i;
            //created a new while loop that activates when one number in the
            //array is less than the next one
            while (j > 0 && n[j] > n[j - 1]) {
                int temp = n[j];
                //switches one number in the array with the previous one
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }
    //created a method called "counting" that takes in one array (h)
    public void Counting(int[] h){
        //created a new array that contains 101 spots
        int[] e = new int [101];
        for (int q = 0; q < h.length; q++){
            e[h[q]] = e[h[q]] + 1;
        }
        int spot = 0;
        for(int a = 0; a < e.length; a++){
            if(e[a] >= 1){
                for(int z = 0; z < e[a]; z++){
                    h[spot] = a;
                    spot++;
                }
            }
        }
    }
    //created a method that takes in one array of strings (words)
    public void Alphabet(String[] w){
        for(int p = 0; p < w.length; p++){
            for(int i = 0; i < w.length-1; i++){
                //checks to see if one word should be in front of another and 
                //switches the locations in the array if necessary
                if(w[i].compareToIgnoreCase(w[i+1]) > 0){
                    String temp = w[i];
                    w[i] = w[i+1];
                    w[i+1] = temp;
                }
            
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        A3 test = new A3();
        int[] n = {2, 1, 5, 8, 1, 7, 10, 6};
        test.Insertion(n);

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        
        int[] h = new int[50];
        for (int p = 0; p < h.length; p++){
            h[p] = (int)(Math.random()*(101));   
        }
        test.Counting(h);
        
        for(int b = 0; b < h.length; b++){
            System.out.println(h[b]);
        }
        
        String[] w = new String[3];
        System.out.println("Enter " + w.length + " words please.");
        for(int g = 0; g < w.length; g++){
            w[g] = input.nextLine();
        }
        test.Alphabet(w);
        
        for(int k = 0; k < w.length; k++){
            System.out.println(w[k]);
        }
        


    }
}
