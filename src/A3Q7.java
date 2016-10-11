/*
 * Write the Java method for Counting Sort that will take an array as a parameter 
 * and sort it using this method of sorting. 
 * We will assume that only the numbers from 0 to 100 will be in the array. 
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
        
        for(int spotInTracker = 0; spotInTracker < tracker.length; spotInTracker++){
            
            int amountOfNum = tracker[spotInTracker];
            
            if (amountOfNum != 0) {
                
                for (int i = 0; i < amountOfNum; i++) {
                    n[spotInArray] = spotInTracker;
                    spotInArray ++;
                    System.out.println("spotInTracker: " + spotInTracker);
                    System.out.println("spotInArray: " + spotInArray);
                    System.out.println("i: " + i);
                    System.out.println("amountOfNum: " + amountOfNum);
                    System.out.println(" ");
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
