
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A3Q6 {

    public static void insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            while (j > 0 && n[j] > n[j - 1]) {
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q6 test = new A3Q6();
        int[] n = new int[4];
        n[0] = 3;
        n[1] = 9;
        n[2] = 4;
        n[3] = 2;
        test.insertionSort(n);
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}
