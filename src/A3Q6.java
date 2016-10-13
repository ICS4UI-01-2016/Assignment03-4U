/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A3Q6 {
    
public void insertionSort(int[] n) {
        //for the int i which equals 1, keep adding 1 onto i as long as i is less than the array length
        for (int i = 1; i < n.length; i++) {
            //create integer to store value of i
            int j = i;
            //while j is inside the part of the arra containing the inputed numbers, and the first number
            //is smaller than the second number, swap the positions of the two numbers
            while (j > 0 && n[j - 1] < n[j]) {
                //create integer to store value of n array at j
                int temp = n[j];
                //swap the positions of n[j] with n[j-1]
                n[j] = n[j - 1];
                n[j - 1] = temp;
                //subtract 1 from j to look at the next set of numbers
                j--;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numList = new int[9];
        
        numList[0] = 6;
        numList[1] = 2;
        numList[2] = 3;
        numList[3] = 4;
        numList[4] = 4;
        numList[5] = 4;
        numList[6] = 2;
        numList[7] = 4;
        numList[8] = 1;



        A3Q6 test = new A3Q6();

        for (int i = 0; i < numList.length; i++) {

            test.insertionSort(numList);
            System.out.println(numList[i]);
        }
    }
}
