
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Problem2 {

    /**
     * 
     * @param unsorted
     * @return 
     */
    public int[] tracker(int[] unsorted){
        int[] tracker = new int[101];
        for(int i=0;i < unsorted.length;i++){
            tracker[unsorted[i]]++;
        }
        return tracker;
    }
    
    public static void main(String[] args) {
        Problem2 test = new Problem2();
        Scanner in = new Scanner(System.in);
        int numOfNumbers = in.nextInt();
        int[] input = new int[numOfNumbers];
        for(int i=0; i<numOfNumbers; i++){
            input[i] = in.nextInt();
        }
        int[] done = new int[numOfNumbers];
        done = test.tracker(input);
        for(int i=0; i<101; i++){
            System.out.println(done[i]);
        }
    }
}
