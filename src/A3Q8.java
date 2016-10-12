/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay
 */
public class A3Q8 {
    public void insertionSort(int[] a){
   for(int j = 1; j < a.length; j++)
   {
      int d = j;
      while(d>0 && a[d-1] > a[d])
      {
         int temp = a[d];
         a[d] = a[d-1];
         a[d-1] = temp;
         d--;
      }
   }
}
    public static void main(String[] args) {

}
}