/*
 * Write a version of insertion sort that will take in an array of Strings and 
 * place the in Alphabetical Order. 
 */

/**
 *
 * @author Jon
 */
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    
    public void alphebetical(String[] l){
        for(int i = 1; i < l.length; i++){
            int j = i;
            while(j > 0 && l[j-1].toLowerCase().compareTo(l[j].toLowerCase()) > 0){
                String temp = l[j];
                l[j] = l[j-1];
                l[j-1] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        A3Q8 test = new A3Q8();
        String [] l = {"dog", "cat", "ant", "bee"};
        test.alphebetical(l);
        for(int i = 0; i < l.length; i ++){
            System.out.print(l[i] + " ");
        }
    }
}
