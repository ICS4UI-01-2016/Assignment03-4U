/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class Assignment3 {
    //A3Q6 - Alter selection sort so as to 

    public void insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            //All I have done is switch the iderection of this pacman so that the while loop runs if the previos position is less than that current, as opposed to more. That's literally it.

            while (j > 0 && n[j - 1] < n[j]) {
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }
    //Need to take array of any SIZE

    public void CountSort(int[] X) {
        //The CountSortArray will be used to store the quantitied of each number. (E.g. if the X array has 3 8s, position 8 of this array will hold an int of 3.)
        int[] CSArray = new int[101];
        //Will always refer to the positon of the X array
        int Position = 0;
        //This refers to the position of the CSaveArray
        int SPosition = 0;
        while (Position < (X.length)) {
            //If the integer saved in X is equal to CountSave, CSaveArray must have 1 added at that position
            while (SPosition < 101) {
                if (X[Position] == SPosition) {
                    //So, if CountSave = 9, and we find an X that equals 9, we add 1 to the CSaveArray at position 9.
                    CSArray[SPosition] = CSArray[SPosition] + 1;
                }
                SPosition++;
            }
            Position++;
            SPosition = 0;
        }
        //Reset these to 0 in order to sort the new values into X positions.
        SPosition = 0;
        Position = 0;
        //While the Position is less than the length of X (Because the array positions include 0, the loop needs to atop at the length - 1)
        while (Position < X.length) {
            //For as long as CSaveArray at a position hold an int, increase the position and add CountSave to theoriginal array
            //E.g. if CSaveArray at CountSave position 8 holds 3, this will run 3 times.
            while (CSArray[SPosition] > 0) {
                //Add ordered numbers to the original array. E.g. X at the position will be 8.
                X[Position] = SPosition;
                //Remove 1 each cylce, so as to let it run however many times it needs. (If CSaveArray at 8 hold an int of 3, then this run 3 times to add 8 to the array 3 times. When the value is reduced to 0, the loop moves on)
                CSArray[SPosition] = CSArray[SPosition] - 1;
                //Position count increases to put next number in next part of array. Progress the position so the 3 8s end up at different consecutive spots in the array.
                Position++;
            }
            //This progresses the CSaveArray's position when the current position is empty or emptied.
            SPosition++;
        }
    }

    public void AlphabetO(String[] W) {
        for (int I = 0; I < W.length; I++) {

            //Count is equal to I and will help run through the array
            int Count = I;

            //Provided it is greater than 0, the strings are compared and switched around if necessary. 
            //'compareToIgnoreCase' will allow letters to be compared without regard for their case(caps lock), as that plays no part in the alphabetical order.
            while (Count > 0 && W[Count - 1].compareToIgnoreCase(W[Count]) > 0) {
                //Arrange them in Aplphabetical Order
                String Temp = W[Count];
                W[Count] = W[Count - 1];
                W[Count - 1] = Temp;
                //Remove one each time to progress the loop. 
                Count--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Assignment3 Test = new Assignment3();
        int[] N = {34, 279, 23, 190, 166, 13, 76};
        Test.insertionSort(N);
        int Count = 0;
        //I learned how for loops work! This is easier than a while loop.
        for(int I = 0; I < N.length; I++) {
            System.out.println("Q6: " + (I + 1) + " " + N[I]);
        }
        //Where 7 starts
        int[] X = {100, 99, 98, 97, 96, 95, 94, 93,
            88, 88, 88, 86, 85, 84, 83, 82, 81, 80,
            79, 78, 77, 77, 74, 74, 73, 72, 71, 70,
            69, 68, 67, 66, 65, 64, 63, 62, 61, 60,
            59, 58, 57, 56, 55, 54, 53, 52, 51, 50,
            49, 48, 47, 46, 45, 44, 43, 45, 41, 40,
            39, 38, 37, 36, 35, 99, 33, 32, 31, 30,
            29, 28, 27, 26, 78, 24, 23, 22, 21, 20,
            19, 18, 76, 16, 15, 45, 13, 12, 11, 10,
            9, 8, 7, 45, 5, 4, 3, 2, 45, 0, 92, 91,
            23
        };
        Test.CountSort(X);
        
        for(int I = 0; I < X.length; I++) {
            System.out.println("Q7: Positon = " + (I + 1) + " - " + X[I]);
        }
        //Where 8 starts
        String[] W = {"h", "i", "J", "Y", "k", "u", "t"};
        Test.AlphabetO(W);
        for(int I = 0; I < W.length; I++) {
            System.out.println("Q8: Positon = " + (I + 1) + " - " + W[I]);
        }
    }
}
//DONE.
