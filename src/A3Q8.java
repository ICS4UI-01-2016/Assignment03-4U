/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    public void insertionSort(String[] n) {
        //for integer i that starts at 1, and i is smaller than the length of n array, keep adding 1 to i
        for (int i = 1; i < n.length; i++) {
            //let int j be same value as i
            int j = i;
            //while j is on the array(bigger than 0), and the position of j-1 in n[] 
            //has a higher case value than j in n[] 
            while (j > 0 && n[j - 1].compareToIgnoreCase(n[j]) > 0) {
                //set a string variable value at the position of j in the n array
                String temp = n[j];
                //set the 2nd position at n to the value of the 1st position in n
                n[j] = n[j - 1];
                //set the 1st position at n to the value of the 2nd position in n
                n[j - 1] = temp;
                //subtract the variable of j by one
                j--;
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String[] strList = {"aab", "aaa" };

        A3Q8 test = new A3Q8();



        test.insertionSort(strList);
        for (int i = 0; i < strList.length; i++) {
            System.out.println(strList[i]);
        }
    }
}
