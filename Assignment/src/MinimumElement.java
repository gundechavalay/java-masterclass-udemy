import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        int capacity;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        capacity = scanner.nextInt();
        scanner.close();
        return capacity;
    }

    private static int[] readElements(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " elements: \r");
        for (int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
