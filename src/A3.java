
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
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
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


    }
}
