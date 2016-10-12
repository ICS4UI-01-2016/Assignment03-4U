/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay
 */
public class A3Q7 {
     public static int[] sort(int[] array) {
 
   
    int[] a = new int[array.length];

    int min = array[0];
    int max = array[0];
    for (int b = 1; b < array.length; b++) {
      if (array[b] < min) {
        min = array[b];
      } else if (array[b] > max) {
        max = array[b];
      }
    }
 
    int[] counts = new int[max - min + 1];

    for (int b = 0;  b < array.length; b++) {
      counts[array[b] - min]++;
    }
 
    counts[0]--;
    for (int b = 1; b < counts.length; b++) {
      counts[b] = counts[b] + counts[b-1];
    }
 
    for (int b = array.length - 1; b >= 0; b--) {
        a[counts[array[b] - min]--] = array[b];
    }
 
    return a;
  }
    public static void main(String[] args) {

}
}