/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A3Q6 {
    
    public void selectionSort(int[] num){
        for(int i = 1; i < num.length; i++) 
        {
            for (int b = i; b > 0 && num[b] > num[b - 1]; b--) 
            {
            int tempInteger = num[b];
            num[b] = num[b - 1];
            num[b - 1] = tempInteger;
        }
      }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q6 test = new A3Q6();
        int[] number = {1, 9, 5, 7, 3, 4};
        test.selectionSort(number);
        for(int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
