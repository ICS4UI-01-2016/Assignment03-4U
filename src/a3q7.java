/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munta
 */
public class a3q7 {

    public int[] countingsort (int[] n) {
        //create new array that stores 101 values
        int[] tracker= new int[101];
        
        for(int i = 0; i < n.length; i++){
            //store the spot current spot of the array in a temp integer.
             int check = n[i];
             //add a value of 1 to the corrspoding point in the tracker array
             tracker[check-1]=tracker[check-1]+1;
             
           }
        //create a integer set a 0,to be used for second set of numbers 
          int t=0;
          for(int i = 0; t < n.length; i++){
              //while the current place of the tracer in the array is grater than 0
              while(tracker[i]!=0){
              n[t]=i+1;//in put the value of what ever place the array is it +(1)
              t++; //add one to t 
              tracker[i]--;//take 1 away from the current spot of the array 
             }
          }
        //return the sorted array.
        return n;
        
        
     }
            
      public static void main(String[] args) {
        //create new test object
        a3q7 test= new a3q7();
       int[] array ={3,5,4,8,2,9,7,45,65,23,56,23,56,78,3,45,89,76,42,56,43};
       test.countingsort(array);
        //for loop that prints numbers in array,untill there are no numbers left
        for(int i=0;i<array.length;i++){
            //print numbers
            System.out.println(array[i]);
    }
    
}
}