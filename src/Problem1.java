
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    
    public int[] revInsert(int[] numbers){
        int[] awnser = new int[numbers.length];
        //do for every number
        for(int i=1; i<numbers.length;i++){
            //check to the sorted array
            for(int n=0; n<awnser.length;n++){
                //
                if(numbers[i]>awnser[n]){
                    //move numbers in array over to make room
                    for(int x = awnser.length; x<n; x--){
                        awnser[x-1] = awnser[x-2];
                    }
                    //insert number in array
                    awnser[n] = numbers[i];
                }
            }
        }
        return awnser;
    }
    
    public static void main(String[] args) {
        Problem1 test = new Problem1();
        Scanner in = new Scanner(System.in);
        int[] input = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        int[] done = new int[];
        done = test.revInsert(input);
        for(int i=0; i<5; i++){
            System.out.println(done[i]);
        }
        
    }
}
