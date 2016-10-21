
import java.util.Arrays;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q7 {

    public int[] countSort(int[] array){
        //tracker
        int track[] = new int[101];
        
        //loop through array
        for(int i = 0; i < array.length; i++){
            //add 1 to each position
            track[array[i] - 1] = track[array[i] - 1] + 1;
            
        }
        //zero variable
        int a = 0;
        
        //takes numbers from array and puts them into tracker
        for(int i = 0; a < array.length; i++){
            while(track[i] > 0){
                array[a] = i + 1;
                a++;
                track[i]--;
            }
        }
        //return
        return array;
        
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       //new test
       Q7 test = new Q7();
       //array to sort
       int input[] = { 2, 1, 4, 5, 7, 1, 1, 8, 9, 10, 11, 14, 15, 3, 2, 4 };
       //test the counter sort
       test.countSort(input);
       //for loop to get through the array
        for (int i = 0; i < input.length; i++) {
            //out print the sorted array
            System.out.print(input[i] + " | ");
		

       
       
       }
       
       }
       
}

