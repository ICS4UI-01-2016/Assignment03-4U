/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A3Q6 {

    // Insertion Sort Method 
    public void insertionSort(int[] number) {
        // The loop runs in the array through each position  
        for (int i = 1; i < number.length; i++) {
            // In order to get the second number smaller than the first, the loop runs pairs of numbers
            for (int a = i; a > 0 && number[a] > number[a - 1]; a--) {
                // Whenever the first number is bigger than the second, the numbers are swapped 
                // Use a temporary integer to store the second value 
                int tempInteger = number[a];
                // The value of the second number is changed with the value of the first number 
                number[a] = number[a - 1];
                // The stored value is changed with the first number 
                number[a - 1] = tempInteger;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        int[] number = {1, 2, 4, 6, 4};
        test.insertionSort(number);
        System.out.println("The numbers sorted in descending order: ");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}
