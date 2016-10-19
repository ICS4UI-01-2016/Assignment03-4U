/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joudn2217
 */
public class A3Q7 {

    public int[] countingSort(int[] n) {
        //created counting sort method
        int partialSum[] = new int[101];
        for (int i = 0; i < n.length; i++) {
            partialSum[n[i]]++;
        }
        //created a new array to track the number of times each digit shows up in the array
        //used a for loop to get the number of times each digit shows up in the array
        for (int i = 1; i < n.length; i++) {
            partialSum[i] += partialSum[i - 1];
        }
        //add added the first number of digits to the next to get the positions of the digits in the new array
        int finalArray[] = new int[n.length];
        //created a new array to store the sorted array
        for (int i = n.length - 1; i >= 0; i--) {
            int placeinarray = partialSum[n[i]] - 1;
            int num = n[i];
            //created ints to store the place in the array the digit will be placed and the number going in that place
            finalArray[placeinarray] = num;
            //start from the last digit of the intial array look at the position of where it needs to go and put it there
            partialSum[n[i]]--;
            //take one away from the array that tracks positions since that spot is now taken
        }

        for (int i = 0; i < n.length; i++) {
            n[i] = finalArray[i];
            //transfer the sorted array back into the original
        }
        return n;
        //set the sorted array as the intial array and return it
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q7 test = new A3Q7();
        int intial[] = {3, 4, 3, 2, 4, 1, 2, 2};
        test.countingSort(intial);
        for (int i = 0; i < intial.length; i++) {
            System.out.println(intial[i]);
        }

    }

}
