/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A3Q6 {

    public int[] descending(int[] n) {
        //loop while the value of i is less than the value of the length of the array and add one to i after each loop
        for (int i = 1; i < n.length; i++) { 
            int x = i; //the value of the integer x is the same as the value of i
            while (x > 0 && n[x - 1] < n[x]) { //loop while the value of x is greater than 0 and the value of one spot before n[x] is less than n[x]
                int temp = n[x]; //a temp integer is the value of n at x
                n[x] = n[x - 1]; //replace the value of n at x with the value of the place before it
                n[x - 1] = temp; //the place before is replaced with the temp integer that was made before
                x--; //take away one value from x
            }
        }
        return n; //return the array
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create the object uses to call the methods
        A3Q6 test = new A3Q6();

        //create in int array with the following numbers
        int[] a = {3, 6, 2, 4, 5, 9, 8};

        //run the sorting method with the array that was just made
        test.descending(a);

        //loop while the value of i is less than the value of the length of the array
        for (int i = 0; i < a.length; i++) {

            //output the current value
            System.out.print(a[i] + ",");

        }

        System.out.println("");
        // TODO code application logic here
    }
}
