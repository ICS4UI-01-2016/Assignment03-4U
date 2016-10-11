/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    
    public void countingSort(int[] n){
        int count = 0;
        int [] tracker = new int [101];
        
        for(int i = 0; i < n.length; i++){
           count = n[i];
           tracker[count] ++;
        }
        
        int spotInArray = 0;
        
        for(int num = 0; num < tracker.length; num++){
            int amountOfNum = tracker[num];
            
            if (amountOfNum != 0) {
                
                for (int i = 0; i < amountOfNum; i++) {
                    n[spotInArray] = num;
                    spotInArray ++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        int [] n = {2, 2, 3, 3, 1, 1, 4, 4, 5, 5};
        test.countingSort(n);
        for(int i = 0; i < n.length; i ++){
            System.out.print(n[i] + " ");
        }
    }
}
