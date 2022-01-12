import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        int i = 0, j = array.length-1, temp;
        System.out.println("Array = " + Arrays.toString(array));
        while (i<=j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
