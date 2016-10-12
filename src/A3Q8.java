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
    public String[] Sort(String[] a){
   for(int j = 1; j < a.length; j++)
   {
      int d = j;
      String e = a[j-1];
      String f = a[j];
      while(d > 0 && e.compareToIgnoreCase(f) > 0){
          String g = a[d];
          a[d] = a[d-1];
          a[d-1] = g;
          d--;
          e = a[d-1];
          f = a[d-1];
      }

   }
   return a;
}
    public static void main(String[] args) {

}
}