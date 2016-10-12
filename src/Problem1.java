
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
        for(int i=0; i<numbers.length;i++){
            awnser[i]= -2147483648;
        }
        boolean placed = false;
        //do for every number
        for(int currentUnsorted=0; currentUnsorted<numbers.length;currentUnsorted++){
            //check to the sorted array
            for(int awnserCheckPostion=0; awnserCheckPostion<awnser.length && !placed ;awnserCheckPostion++){
                //
                if(numbers[currentUnsorted]>awnser[awnserCheckPostion]){
                    //move numbers in array over to make room
                    for(int shiftPos = currentUnsorted; shiftPos>awnserCheckPostion; shiftPos--){
                        if(shiftPos!=0){
                            awnser[shiftPos] = awnser[shiftPos-1];
                        }
                    }
                    //insert number in array
                    awnser[awnserCheckPostion] = numbers[currentUnsorted];
                    placed = true;
                }
            }
            placed = false;
        }
        return awnser;
    }
    
    public static void main(String[] args) {
        Problem1 test = new Problem1();
        Scanner in = new Scanner(System.in);
        int numOfNumbers = in.nextInt();
        int[] input = new int[numOfNumbers];
        for(int i=0; i<numOfNumbers; i++){
            input[i] = in.nextInt();
        }
        int[] done = new int[numOfNumbers];
        done = test.revInsert(input);
        for(int i=0; i<numOfNumbers; i++){
            System.out.println(done[i]);
        }
        
    }
}
