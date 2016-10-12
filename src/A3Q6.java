/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay
 */
public class A3Q6 {
    
    public void selectionsort(int[] num){
        for(int a = 1; a< num.length; a++){
        for (int b = a; b > 0 && num[b] > num[b-1]; b--){
        int tempInteger = num[b];
        num[b]= num[b-1];
        num[b-1] = tempInteger;
    }
    }
    }
    public static void main(String[] args) {
       
        A3Q6 test = new A3Q6();
        int[] num = {1, 6, 2, 7, 12, 4};
        test.selectionsort(num);
        for(int a = 0; a < num.length; a++){
        System.out.println(num[a]);
    }
}
}