/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A3Q7 {

    public int[] countSort(int[] n) {
        //tracker array
        int[] count = new int[101];

        //loop through n array
        for(int i = 0; i < n.length; i++) {
            
            //add 1 to count array each time
            count[n[i] - 1] = count[n[i] - 1] + 1;  
        }
        
        //make variable that equals 0
        int x = 0;
        
        //sort n array using count array
        for(int i = 0; x < n.length; i ++){
            while(count[i] > 0){
                n[x] = i + 1;
                x++;
                count[i]--;
            }
        }
        
        //return array
        return n;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create method
        A3Q7 test = new A3Q7();

        //create array
        int[] n = {45, 67, 34, 34, 56, 23, 45, 12, 34, 56, 34, 56, 67, 7};

        //call up method
        test.countSort(n);

        //loop through array to output numbers
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
