
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Problem3 {
    
    public String[] sort(String[] words){
        String[] awnser = new String[words.length];
        for(int i=0; i<words.length;i++){
            awnser[i]= "zzzzzzzzzzzzzzzzzzz";
        }
        boolean placed = false;
        //do for every word
        for(int currentUnsorted=0; currentUnsorted<words.length;currentUnsorted++){
            //check to the sorted array
            for(int awnserCheckPostion=0; awnserCheckPostion<awnser.length && !placed ;awnserCheckPostion++){
                //
                if(words[currentUnsorted].compareTo(awnser[awnserCheckPostion])<0){
                    //move words in array over to make room
                    for(int shiftPos = currentUnsorted; shiftPos>awnserCheckPostion; shiftPos--){
                        if(shiftPos!=0){
                            awnser[shiftPos] = awnser[shiftPos-1];
                        }
                    }
                    //insert word in array
                    awnser[awnserCheckPostion] = words[currentUnsorted];
                    placed = true;
                }
            }
            placed = false;
        }
        return awnser;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem3 test = new Problem3();
        //make a scanner
        Scanner in = new Scanner(System.in);
        //ask user how long they want the array to be
        System.out.println("How long do you want the array?");
        //get length
        int length = in.nextInt();
        //create string array
        String[] words = new String[length]; 
        //ask user for input
        System.out.println("Enter " + length + " words / sentences.");
        //store strings in words
        for(int i = 0; i < length; i++){
            words[i] = in.next();
        }
        String sorted[] = test.sort(words);
        System.out.println("Here is the sorted words / sentences.");
        for(int i = 0; i < length; i++){
            System.out.println(sorted[i]);
        }
    }

}
