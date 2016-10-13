/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public void countingSort(int[] n) {
        //create tracker array with 101 spots
        int[] tracker = new int[101];

        //go through the list of numbers once
        for (int i = 0; i < n.length; i++) {
            //add 1 to each section in the array that corresponds with the number found(ex. 3 to tracker[3]++
            tracker[n[i]]++;

        }

        //create an integer y set at 0
        int y = 0;

        //while the number at y position of tracker array doesn't equal 0
        while (y < 101) {
            //if tracker array at y is greater than 0(meaning there is a value inputed for it)
            if (tracker[y] > 0) {
                //print out the y position
                System.out.println(y);
                //subtract 1 from the value at y in the tracker array
                tracker[y]--;
            }
            //if the tracker array is smaller than 1
            if (tracker[y] < 1) {
                //add 1 to y
                y++;
            }
            //if y becomes larger than 101
            if (y > 101) {
                //break the loop
                break;
            }

        }
        

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] numList = {8, 7, 6, 6, 6, 6, 4, 4, 7, 1, 1, 1, 1, 1, 1, 1, 0, 0};


        A3Q7 test = new A3Q7();



        test.countingSort(numList);




    }
}
