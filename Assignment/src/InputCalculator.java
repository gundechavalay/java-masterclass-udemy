import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg = 0;
        while (true)
        {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                sum += scanner.nextInt();
                count++;
            }
            else {
                avg = Math.round((double) sum/count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
