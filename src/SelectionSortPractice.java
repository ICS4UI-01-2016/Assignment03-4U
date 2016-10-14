
//  0   1   2   3   4 <---- Index
//  10  5   3   7   2 <---- Elements of array
//  i                 <---- Outer loop i
//      j             <---- Inner loop j
/**
 *
 * @author Denis
 */
public class SelectionSortPractice {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 7, 2};
        selectingSort(numbers);
        printArray(numbers);
    }

    public static int[] selectingSort(int[] a) {
        // Outer Loop
        // Start at the first element and go up to the second from the end element 
        for (int i = 0; i < a.length - 1; i++) {
            // Keep track of the smallest element's position (It's index amount/number)
            int minIndex = i;
            // Inner loop
            // Start at the next position in the array and go through the remaining items
            for (int j = i + 1; j < a.length; j++) {
                // If the current element is smaller than the minimum I have found, keep track of it instead
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // SWITCHING THE NUMBERS
            //  Swap the smallest element into its proper position index
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }

    // Print the array
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
