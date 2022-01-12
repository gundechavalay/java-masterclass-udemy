import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int number) {
        int[] intArray = new int[number];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        return intArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers (int[] unsortedArray) {
        int[] sortedArray = unsortedArray;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length-1; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }

        }
        return sortedArray;
    }
}
